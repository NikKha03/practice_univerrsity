package ru.practice.practice_university.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class MyUser {
    @Id
    @GeneratedValue
    private Long ID_user;
    @Column(unique = true)
    private String email;
    @Column(unique = true)
    private String login;
    private String password;
    private String roles;
}
