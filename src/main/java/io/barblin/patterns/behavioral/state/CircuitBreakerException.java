package io.barblin.patterns.behavioral.state;

public class CircuitBreakerException extends Exception {
    public CircuitBreakerException(String message) {
        super(message);
    }
}