package io.barblin.patterns.behavioral.chainofresponsibility;

public abstract class Support {

    private final Ticket.Level responsibility;
    private final Support successor;

    public Support(Ticket.Level responsibility, Support successor) {
        this.responsibility = responsibility;
        this.successor = successor;
    }

    public String delegate(Ticket ticket) {
        if (this.responsibility.equals(ticket.getLevel())) {
            return handle();
        } else if (successor != null) {
            return this.successor.delegate(ticket);
        } else {
            throw new IllegalStateException("Support issue could not be delegated due to missing successor in chain.");
        }
    }

    protected abstract String handle();
}
