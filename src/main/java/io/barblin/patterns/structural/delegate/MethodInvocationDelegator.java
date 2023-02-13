package io.barblin.patterns.structural.delegate;

public class MethodInvocationDelegator {

    private final UserService userService;

    public MethodInvocationDelegator(UserService userService) {
        this.userService = userService;
    }

    public void addUserWithMethodInvocation(String user) {
        this.userService.addUser(user);
    }

}
