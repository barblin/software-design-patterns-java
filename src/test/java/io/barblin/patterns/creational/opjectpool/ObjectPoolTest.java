package io.barblin.patterns.creational.opjectpool;

import io.barblin.patterns.creational.opjectpool.mocks.ConnectionSupplier;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.*;

class ObjectPoolTest {


    @Test
    void shouldCreateConnectionPoolWithZeroEntries() {
        DatabaseConnectionPool connectionPool = DatabaseConnectionPool.of(
                "test", "test", "test", 0
        );

        assertFalse(connectionPool.hasNext());
    }

    @Test
    void shouldCreateConnectionPoolWithOneEntry() {
        DatabaseConnectionPool connectionPool = DatabaseConnectionPool.of(
                "test", "test", "test", 0
        );

        Connection expected = ConnectionSupplier.generic();
        connectionPool.releaseConnection(expected);

        assertTrue(connectionPool.hasNext());
        assertEquals(expected, connectionPool.take());
    }
}