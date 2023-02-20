package io.barblin.patterns.behavioral.mediator;

import java.util.LinkedList;

public class User {

    private final String name;
    private final ChatRoom chatRoom;
    private final LinkedList<String> messageHistory;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
        this.messageHistory = new LinkedList<>();
    }

    public void sendMessage(String message) {
        chatRoom.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        messageHistory.addLast(message);
    }

    public LinkedList<String> getMessageHistory() {
        return messageHistory;
    }
}
