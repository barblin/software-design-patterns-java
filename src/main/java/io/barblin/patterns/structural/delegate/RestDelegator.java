package io.barblin.patterns.structural.delegate;

public class RestDelegator {
    private final UserService userService;

    public RestDelegator(UserService userService) {
        this.userService = userService;
    }

    public void addUserWithRestApi(String user) {
        this.userService.addUser(user);
    }
}
