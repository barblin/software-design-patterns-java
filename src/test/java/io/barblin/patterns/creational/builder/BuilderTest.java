package io.barblin.patterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

import io.barblin.patterns.creational.builder.Email.EmailBuilder;
import io.barblin.patterns.creational.builder.Email.Importance;

public class BuilderTest {
    private static final String TEST_RECIPIENT = "test.test@test.at";
    private static final String TEST_CARBON_COPY = "cc@test.at";
    private static final String TEST_BLIND_CARBON_COPY = "bcc@test.at";
    private static final String TEST_FROM = "from@test.at";
    private static final String TEST_SUBJECT = "subject";
    private static final String TEST_BODY = "body";

    @Test
    void buildEmailShouldReturnEmail() {

        Email email = EmailBuilder.create()
                .recipients(Set.of(TEST_RECIPIENT))
                .carbonCopy(Set.of(TEST_CARBON_COPY))
                .blindCarbonCopy(Set.of(TEST_BLIND_CARBON_COPY))
                .from(TEST_FROM)
                .subject(TEST_SUBJECT)
                .body(TEST_BODY)
                .importance(Importance.HIGH)
                .build();

        assertTrue(email.getRecipients().contains(TEST_RECIPIENT));
        assertTrue(email.getCarbonCopy().contains(TEST_CARBON_COPY));
        assertTrue(email.getBlindCarbonCopy().contains(TEST_BLIND_CARBON_COPY));
        assertEquals(TEST_FROM, email.getFrom());
        assertEquals(TEST_SUBJECT, email.getSubject());
        assertEquals(TEST_BODY, email.getBody());
        assertEquals(Importance.HIGH, email.getImportance());

    }
}