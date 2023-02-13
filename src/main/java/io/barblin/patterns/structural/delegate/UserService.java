package io.barblin.patterns.structural.delegate;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(String user) {
        userDao.add(user);
    }
}
