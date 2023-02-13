package io.barblin.patterns.structural.delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserManagementTest {

    @Test
    void addUserShouldAddUserByMethodInvocation() {
        UserDao userDaoMock = createDaoMock();
        UserService userService = new UserService(userDaoMock);

        MethodInvocationDelegator delegator = new MethodInvocationDelegator(userService);
        delegator.addUserWithMethodInvocation("user");

        assertEquals("user", userDaoMock.get());
    }

    @Test
    void addUserShouldAddUserByRestEndpoint() {
        UserDao userDaoMock = createDaoMock();
        UserService userService = new UserService(userDaoMock);

        RestDelegator delegator = new RestDelegator(userService);
        delegator.addUserWithRestApi("user");

        assertEquals("user", userDaoMock.get());
    }

    private UserDao createDaoMock() {
        return new UserDao() {
            private String user;

            @Override
            public void add(String user) {
                this.user = user;
            }

            @Override
            public String get() {
                return this.user;
            }
        };
    }
}