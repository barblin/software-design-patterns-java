package io.barblin.patterns.builder;

import java.util.Set;

public final class Email {

    private final Set<String> recipients;
    private final Set<String> carbonCopy;
    private final Set<String> blindCarbonCopy;
    private final String from;
    private final String subject;
    private final String body;
    private final Importance importance;

    private Email(EmailBuilder builder) {
        this.recipients = builder.recipients;
        this.carbonCopy = builder.carbonCopy;
        this.blindCarbonCopy = builder.blindCarbonCopy;
        this.from = builder.from;
        this.subject = builder.subject;
        this.body = builder.body;
        this.importance = builder.importance;
    }

    public Set<String> getRecipients() {
        return recipients;
    }

    public Set<String> getCarbonCopy() {
        return carbonCopy;
    }

    public Set<String> getBlindCarbonCopy() {
        return blindCarbonCopy;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public Importance getImportance() {
        return importance;
    }

    public enum Importance {
        HIGH, NORMAL, LOW
    }

    public static class EmailBuilder {
        private Set<String> recipients;
        private Set<String> carbonCopy;
        private Set<String> blindCarbonCopy;
        private String from;
        private String subject;
        private String body;
        private Importance importance;

        private EmailBuilder() {

        }

        public EmailBuilder recipients(Set<String> recipients) {
            this.recipients = recipients;
            return this;
        }

        public EmailBuilder carbonCopy(Set<String> cc) {
            this.carbonCopy = cc;
            return this;
        }

        public EmailBuilder blindCarbonCopy(Set<String> bcc) {
            this.blindCarbonCopy = bcc;
            return this;
        }

        public EmailBuilder from(String from) {
            this.from = from;
            return this;
        }

        public EmailBuilder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder body(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder importance(Importance importance) {
            this.importance = importance;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

        public static EmailBuilder create() {
            return new EmailBuilder();
        }
    }
}