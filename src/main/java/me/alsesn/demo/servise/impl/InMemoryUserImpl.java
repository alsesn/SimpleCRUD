package me.alsesn.demo.servise.impl;

import me.alsesn.demo.model.User;
import me.alsesn.demo.servise.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserImpl implements UserService {
    @Override
    public List<User> findAllUser() {
        return List.of(
                User.builder().firstName("Test").lastname("Test").email("test737@domain.com").password("test").build(),
                User.builder().firstName("Test").lastname("Test").email("test737@domain.com").password("test").build(),
                User.builder().firstName("Test").lastname("Test").email("test737@domain.com").password("test").build()
        );
    }
}
