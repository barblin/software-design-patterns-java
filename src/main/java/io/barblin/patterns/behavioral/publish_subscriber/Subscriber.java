package io.barblin.patterns.behavioral.publish_subscriber;

public sealed interface Subscriber permits SubscriberNews {
    void update(PublisherNews.Topic topic, String message);
}
