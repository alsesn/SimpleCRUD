package me.alsesn.demo.contoller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.alsesn.demo.model.User;
import me.alsesn.demo.servise.UserService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("save_user")
    public String saveUser(@RequestBody User user) {
        service.saveUser(user);
        return "User successfully saved";
    }

    @GetMapping("/{email}")
    public User findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String  email) {
        service.deleteUser(email);
    }
}
