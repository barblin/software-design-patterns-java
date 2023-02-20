package io.barblin.patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MediatorTest {

    @Test
    void sendMessageShouldSendToAllUsers() {
        ChatRoom chatRoom = new ChatRoomBroadcast();
        User user1 = new User("Joh", chatRoom);
        User user2 = new User("Fil", chatRoom);
        User user3 = new User("Kai", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        List<String> messages = new ArrayList<>();
        messages.add("Hello, everyone!");
        messages.add("Hello to you, whats up!");
        messages.add("Greetings!");

        user1.sendMessage(messages.get(0));
        user2.sendMessage(messages.get(1));
        user3.sendMessage(messages.get(2));

        LinkedList<String> messageHistoryUser1 = user1.getMessageHistory();
        assertEquals(2, messageHistoryUser1.size());
        assertTrue(messageHistoryUser1.contains(messages.get(1)));
        assertTrue(messageHistoryUser1.contains(messages.get(2)));

        LinkedList<String> messageHistoryUser2 = user2.getMessageHistory();
        assertEquals(2, messageHistoryUser2.size());
        assertTrue(messageHistoryUser2.contains(messages.get(0)));
        assertTrue(messageHistoryUser2.contains(messages.get(2)));
    }
}