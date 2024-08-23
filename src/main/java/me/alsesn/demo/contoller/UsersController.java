package me.alsesn.demo.contoller;

import me.alsesn.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {
    @GetMapping
    public List<User> findAllUser() {
        return List.of(
                User.builder().firstName("Rostislav").lastname("Susak").email("rostSus712@domain.com").password("1fsadfsg13421").build(),
                User.builder().firstName("Anna").lastname("Gulin").email("anna123a@domain.com").password("4123fastgtg212dfADFsadf").build(),
                User.builder().firstName("Vasily").lastname("Melnch").email("vasa@domain.com").password("124rfsafgsdaf").build()
        );
    }
}
