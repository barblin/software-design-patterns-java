package io.barblin.patterns.behavioral.chainofresponsibility;

class SecondLevelSupport extends Support {
    public SecondLevelSupport() {
        super(Ticket.Level.SECOND, new ThirdLevelSupport());
    }

    @Override
    protected String handle() {
        return "Level 2";
    }
}
