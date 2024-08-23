package me.alsesn.demo.servise;

import me.alsesn.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User saveUser(User user);
    User findByEmail(String email);
    User updateUser(User user);
    void deleteUser(String email);
}
