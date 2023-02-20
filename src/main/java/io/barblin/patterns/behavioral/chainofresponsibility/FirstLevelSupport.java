package io.barblin.patterns.behavioral.chainofresponsibility;

public class FirstLevelSupport extends Support {
    public FirstLevelSupport() {
        super(Ticket.Level.FIRST, new SecondLevelSupport());
    }

    @Override
    protected String handle() {
        return "Level 1";
    }
}
