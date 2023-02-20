package io.barblin.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomBroadcast implements ChatRoom {

    private final List<User> users;

    public ChatRoomBroadcast() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
