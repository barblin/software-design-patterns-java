package io.barblin.patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    @Test
    void gameStateShouldRecoverFromMemento() {
        LinkedList<GameState.Memento> history = new LinkedList<>();

        GameState state = new GameState();
        state.set("1");
        state.set("2");

        history.add(state.quickSave());

        state.set("3");
        history.add(state.quickSave());

        state.restore(history.getFirst());
        assertEquals("2", state.get());
        state.restore(history.getLast());
        assertEquals("3", state.get());
    }
}