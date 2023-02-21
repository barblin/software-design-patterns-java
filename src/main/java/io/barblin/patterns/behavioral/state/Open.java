package io.barblin.patterns.behavioral.state;

final class Open implements CircuitBreakerState {

    private final CircuitBreaker circuitBreaker;
    private final SomeService someService;
    private final long retryAfter;

    public Open(CircuitBreaker circuitBreaker, SomeService someService) {
        this.circuitBreaker = circuitBreaker;
        this.someService = someService;
        this.retryAfter = System.currentTimeMillis() + circuitBreaker.getRetryTime();
    }

    @Override
    public void execute() throws CircuitBreakerException {
        if (System.currentTimeMillis() >= retryAfter) {
            circuitBreaker.setState(new HalfOpen(circuitBreaker, someService));
        } else {
            throw new CircuitBreakerException("Circuit breaker is open. Retry after " + retryAfter + " milliseconds.");
        }
    }
}
