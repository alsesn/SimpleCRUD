package me.alsesn.demo.servise.impl;

import lombok.AllArgsConstructor;
import me.alsesn.demo.model.User;
import me.alsesn.demo.repository.InMemoryUserDAO;
import me.alsesn.demo.servise.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryUserServiceImpl implements UserService {
    private final InMemoryUserDAO repository;

    @Override
    public List<User> findAllUser() {
        return repository.findAllUser();
    }

    @Override
    public User saveUser(User user) {
        return repository.saveUser(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUser(String email) {
         repository.deleteUser(email);
    }
}
