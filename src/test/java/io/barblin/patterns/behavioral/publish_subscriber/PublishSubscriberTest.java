package io.barblin.patterns.behavioral.publish_subscriber;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PublishSubscriberTest {

    @Test
    void publisherShouldNotifySubscribers() {
        PublisherNews publisher = new PublisherNews();

        SubscriberNews sports = new SubscriberNews("Sports1", new EnumMap<>(PublisherNews.Topic.class));
        SubscriberNews sports2 = new SubscriberNews("Sports2", new EnumMap<>(PublisherNews.Topic.class));
        SubscriberNews politics = new SubscriberNews("Pol", new EnumMap<>(PublisherNews.Topic.class));
        SubscriberNews tech = new SubscriberNews("Tech", new EnumMap<>(PublisherNews.Topic.class));

        publisher.subscribe(PublisherNews.Topic.SPORT, sports);
        publisher.subscribe(PublisherNews.Topic.SPORT, sports2);
        publisher.subscribe(PublisherNews.Topic.POLITICS, politics);
        publisher.subscribe(PublisherNews.Topic.TECHNOLOGY, tech);

        publisher.notify(PublisherNews.Topic.SPORT, "Manchester United suffer defeat by Liverpool");

        assertTrue(sports.history().get(PublisherNews.Topic.SPORT).getLast().equals(
                "Manchester United suffer defeat by Liverpool"
        ));
        assertTrue(sports2.history().get(PublisherNews.Topic.SPORT).getLast().equals(
                "Manchester United suffer defeat by Liverpool"
        ));
        assertTrue(politics.history().getOrDefault(PublisherNews.Topic.SPORT, new LinkedList<>()).isEmpty());
        assertTrue(tech.history().getOrDefault(PublisherNews.Topic.SPORT, new LinkedList<>()).isEmpty());

        publisher.notify(PublisherNews.Topic.TECHNOLOGY, "New version of something released");

        assertTrue(sports.history().getOrDefault(PublisherNews.Topic.TECHNOLOGY, new LinkedList<>()).isEmpty());
        assertTrue(sports2.history().getOrDefault(PublisherNews.Topic.TECHNOLOGY, new LinkedList<>()).isEmpty());
        assertTrue(politics.history().getOrDefault(PublisherNews.Topic.TECHNOLOGY, new LinkedList<>()).isEmpty());
        assertTrue(tech.history().get(PublisherNews.Topic.TECHNOLOGY).getLast().equals(
                "New version of something released"
        ));

        publisher.unsubscribe(PublisherNews.Topic.SPORT, sports2);
        publisher.notify(PublisherNews.Topic.SPORT, "Some Victory");

        assertTrue(sports.history().get(PublisherNews.Topic.SPORT).getLast().equals(
                "Some Victory"
        ));
        assertTrue(sports2.history().get(PublisherNews.Topic.SPORT).getLast().equals(
                "Manchester United suffer defeat by Liverpool"
        ));
    }
}