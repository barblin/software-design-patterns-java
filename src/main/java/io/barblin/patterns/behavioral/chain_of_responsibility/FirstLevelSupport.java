package io.barblin.patterns.behavioral.chain_of_responsibility;

public class FirstLevelSupport extends Support {
    public FirstLevelSupport() {
        super(Ticket.Level.FIRST, new SecondLevelSupport());
    }

    @Override
    protected String handle() {
        return "Level 1";
    }
}
