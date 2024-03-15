package ru.practice.practice_university.services;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.practice.practice_university.models.MyUser;
import ru.practice.practice_university.repository.UserRepository;

@Service
@AllArgsConstructor
public class AppService {
    private final PasswordEncoder passwordEncoder;
    private UserRepository repository;

    public void addUser(MyUser user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repository.save(user);
    }
}
