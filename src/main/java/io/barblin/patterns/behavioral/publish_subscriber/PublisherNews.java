package io.barblin.patterns.behavioral.publish_subscriber;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;

public class PublisherNews {

    enum Topic {
        SPORT,
        POLITICS,
        TECHNOLOGY
    }

    private final EnumMap<Topic, List<Subscriber>> subscribers;

    public PublisherNews() {
        subscribers = new EnumMap<>(Topic.class);
    }

    public void subscribe(Topic topic, Subscriber subscriber) {
        if (Objects.isNull(topic)) {
            throw new IllegalStateException();
        }

        List<Subscriber> subscriberList = subscribers.getOrDefault(topic, new ArrayList<>());
        subscriberList.add(subscriber);
        subscribers.put(topic, subscriberList);
    }

    public void unsubscribe(Topic topic, Subscriber subscriber) {
        if (Objects.isNull(topic)) {
            return;
        }

        List<Subscriber> subscriberList = subscribers.getOrDefault(topic, new ArrayList<>());
        subscriberList.remove(subscriber);
        subscribers.put(topic, subscriberList);
    }

    public void notify(Topic topic, String message) {
        if (Objects.isNull(topic)) {
            return;
        }

        List<Subscriber> subscriberList = subscribers.getOrDefault(topic, new ArrayList<>());

        for (Subscriber subscriber : subscriberList) {
            subscriber.update(topic, message);
        }
    }
}
