package me.alsesn.demo.contoller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.alsesn.demo.model.User;
import me.alsesn.demo.servise.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UsersController {
    private final UserService service;

    @GetMapping
    public List<User> findAllUser() {
        //todo
        return service.findAllUser();
    }
}
