package io.barblin.patterns.behavioral.state;

sealed interface CircuitBreakerState permits Open, HalfOpen, Closed {
    void execute() throws CircuitBreakerException;
}
