package me.alsesn.demo.model;

import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
}
