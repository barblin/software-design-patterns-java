package io.barblin.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StateTest {

    @Test
    void executeWithoutFailureShouldKeepCircuitBreakerAtClosed() throws CircuitBreakerException {
        SomeService someService = () -> {
        };

        CircuitBreaker circuitBreaker = new CircuitBreaker(someService, 1, 2000);
        circuitBreaker.execute();

        assertEquals(Closed.class, circuitBreaker.getState().getClass());
    }

    @Test
    void executeWithFailureShouldSetStateOpen() throws CircuitBreakerException {
        SomeService failedService = () -> {
            throw new NullPointerException();
        };

        CircuitBreaker circuitBreaker = new CircuitBreaker(failedService, 1, 2000);
        circuitBreaker.execute();

        assertEquals(Open.class, circuitBreaker.getState().getClass());
    }

    @Test
    void executeWithFailureShouldSetStateHalfOpenAfterTimout() throws CircuitBreakerException, InterruptedException {
        CircuitBreaker circuitBreaker = new CircuitBreaker(() -> {
        }, 1, 1000);
        circuitBreaker.setState(new Open(circuitBreaker, () -> {
        }));

        sleep(1001);
        circuitBreaker.execute();

        assertEquals(HalfOpen.class, circuitBreaker.getState().getClass());
    }

    @Test
    void executeWithFailureOnHalfOpenShouldSetStateToOpen() throws CircuitBreakerException, InterruptedException {
        SomeService failedService = () -> {
            throw new NullPointerException();
        };

        CircuitBreaker circuitBreaker = new CircuitBreaker(failedService, 1, 1000);
        circuitBreaker.execute();

        sleep(1001);
        circuitBreaker.execute();
        circuitBreaker.execute();

        assertEquals(Open.class, circuitBreaker.getState().getClass());
    }

    @Test
    void halfOpenCircuitBreakerShouldCloseOnSuccess() throws CircuitBreakerException {
        CircuitBreaker circuitBreaker = new CircuitBreaker(() -> {
        }, 1, 1000);
        circuitBreaker.setState(new HalfOpen(circuitBreaker, () -> {
        }));

        circuitBreaker.execute();

        assertEquals(Closed.class, circuitBreaker.getState().getClass());
    }
}