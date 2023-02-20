package io.barblin.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChainOfResponsibilityTest {

    @Test
    void chainOfResponsibilityShouldCorrectlyDelegateTicket() {
        Support firstLevelSupport = new FirstLevelSupport();

        assertEquals("Level 1", firstLevelSupport.delegate(Ticket.of(Ticket.Level.FIRST)));
        assertEquals("Level 2", firstLevelSupport.delegate(Ticket.of(Ticket.Level.SECOND)));
        assertEquals("Level 3", firstLevelSupport.delegate(Ticket.of(Ticket.Level.THIRD)));

        assertThrows(IllegalStateException.class, () -> firstLevelSupport.delegate(Ticket.of(null)));
    }
}