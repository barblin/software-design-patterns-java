package io.barblin.patterns.behavioral.mediator;

public interface ChatRoom {

    void sendMessage(String message, User user);

    void addUser(User user);
}
