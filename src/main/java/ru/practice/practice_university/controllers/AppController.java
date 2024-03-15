package ru.practice.practice_university.controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.practice.practice_university.models.MyUser;
import ru.practice.practice_university.services.AppService;

@RestController
@RequestMapping()
@AllArgsConstructor
public class AppController {
    private AppService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Добро пожаловать в новостной портал! Войдите или зарегистрируйтесь.";
    }

    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/content")
    public String content() {
        return "Контент для авторизованных пользователей.";
    }

    /*
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/all-users")
    public MyUser getUsers() {
        return ;
    }
    */

    @PostMapping("/new-user")
    public String addUser(@RequestBody MyUser user) {
        service.addUser(user);
        return "Пользователь сохранен";
    }
}
