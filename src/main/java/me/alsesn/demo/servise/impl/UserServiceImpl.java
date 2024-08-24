package me.alsesn.demo.servise.impl;

import lombok.AllArgsConstructor;
import me.alsesn.demo.model.User;
import me.alsesn.demo.repository.UserRepository;
import me.alsesn.demo.servise.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public List<User> findAllUser() {
        return repository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(String email) {
        repository.deleteByEmail(email);
    }
}
