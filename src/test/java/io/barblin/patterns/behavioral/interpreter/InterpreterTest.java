package io.barblin.patterns.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterpreterTest {

    @Test
    void interpreterShouldPerformStringEncodedOperations() {
        Interpreter interpreter = new Interpreter();

        assertEquals(3, interpreter.interpret("1 2 +"));
        assertEquals(2, interpreter.interpret("5 3 -"));
        assertEquals(1, interpreter.interpret("2 3 + 4 -"));
    }
}