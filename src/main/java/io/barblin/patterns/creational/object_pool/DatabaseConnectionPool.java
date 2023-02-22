package io.barblin.patterns.creational.object_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DatabaseConnectionPool {
    private BlockingQueue<Connection> connections;

    private DatabaseConnectionPool(String url, String username, String password, int poolSize) {
        connections = new LinkedBlockingQueue<>();

        for (int i = 0; i < poolSize; i++) {
            try {
                connections.offer(DriverManager.getConnection(url, username, password));
            } catch (SQLException e) {
                throw new IllegalArgumentException(String.format("Please check the provided " +
                                "url: %s, " +
                                "username: %s, " +
                                "passowrd: %s",
                        url, username, password));
            }
        }
    }

    public static DatabaseConnectionPool of(String url, String username, String password, int poolSize) {
        return new DatabaseConnectionPool(url, username, password, poolSize);
    }

    public Connection take() throws IllegalStateException {
        try {
            return connections.take();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Thread was interrupted.");
        }
    }

    public void releaseConnection(Connection con) {
        connections.offer(con);
    }

    public boolean hasNext() {
        return !connections.isEmpty();
    }
}
