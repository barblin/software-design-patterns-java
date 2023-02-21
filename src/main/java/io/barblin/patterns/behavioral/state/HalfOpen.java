package io.barblin.patterns.behavioral.state;

final class HalfOpen implements CircuitBreakerState {

    private final CircuitBreaker circuitBreaker;
    private final SomeService someService;

    public HalfOpen(CircuitBreaker circuitBreaker, SomeService someService) {
        this.circuitBreaker = circuitBreaker;
        this.someService = someService;
    }

    @Override
    public void execute() {
        try {
            someService.execute();
            circuitBreaker.setState(new Closed(circuitBreaker, someService));
        } catch (NullPointerException exception) {
            circuitBreaker.setState(new Open(circuitBreaker, someService));
        }
    }
}
