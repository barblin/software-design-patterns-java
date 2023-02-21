package io.barblin.patterns.behavioral.state;

final class Closed implements CircuitBreakerState {

    private final CircuitBreaker circuitBreaker;
    private final SomeService someService;
    private int failureCount;

    public Closed(CircuitBreaker circuitBreaker, SomeService someService) {
        this.circuitBreaker = circuitBreaker;
        this.someService = someService;
    }

    @Override
    public void execute() {
        try {
            someService.execute();
        } catch (NullPointerException exception){
            failureCount++;
        }

        if(circuitBreaker.getFailureThreshold() <= failureCount){
            circuitBreaker.setState(new Open(circuitBreaker, someService));
        }
    }
}
