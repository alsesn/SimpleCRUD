package me.alsesn.demo.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class User {
    private String firstName;
    private String lastname;
    private String email;
    private String password;

    private LocalDate dateOfBirth;
}
