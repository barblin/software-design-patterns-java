package io.barblin.patterns.behavioral.publish_subscriber;

import java.util.EnumMap;
import java.util.LinkedList;

public record SubscriberNews(
        String id,
        EnumMap<PublisherNews.Topic, LinkedList<String>> history
) implements Subscriber {


    @Override
    public void update(PublisherNews.Topic topic, String message) {
        LinkedList<String> topicHistory = history.getOrDefault(topic, new LinkedList<>());
        topicHistory.addLast(message);
        history.put(topic, topicHistory);
    }
}
