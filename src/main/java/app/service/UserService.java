package app.service;

import app.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUserById(int id);
}
