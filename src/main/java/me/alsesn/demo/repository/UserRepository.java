package me.alsesn.demo.repository;

import me.alsesn.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteByEmail(String email);
    User findUserByEmail(String email);
}
