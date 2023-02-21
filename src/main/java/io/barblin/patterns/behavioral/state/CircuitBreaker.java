package io.barblin.patterns.behavioral.state;

public class CircuitBreaker {

    private final int failureThreshold;
    private final long retryTime;
    private CircuitBreakerState state;

    public CircuitBreaker(SomeService someService, int failureThreshold, long retryTime) {
        this.failureThreshold = failureThreshold;
        this.retryTime = retryTime;
        state = new Closed(this, someService);
    }

    public void execute() throws CircuitBreakerException {
        state.execute();
    }

    public int getFailureThreshold() {
        return this.failureThreshold;
    }

    public void setState(CircuitBreakerState state) {
        this.state = state;
    }

    public CircuitBreakerState getState() {
        return this.state;
    }

    public long getRetryTime() {
        return this.retryTime;
    }
}
