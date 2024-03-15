package ru.practice.practice_university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practice.practice_university.models.MyUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByLogin(String username);
}
