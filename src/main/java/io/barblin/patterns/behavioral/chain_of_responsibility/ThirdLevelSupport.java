package io.barblin.patterns.behavioral.chain_of_responsibility;

class ThirdLevelSupport extends Support {
    public ThirdLevelSupport() {
        super(Ticket.Level.THIRD, null);
    }

    @Override
    protected String handle() {
        return "Level 3";
    }
}
