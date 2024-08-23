package me.alsesn.demo.servise;

import me.alsesn.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}
