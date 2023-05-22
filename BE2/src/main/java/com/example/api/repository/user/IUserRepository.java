package com.example.api.repository.user;

import com.example.api.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);

    Boolean existsByUserName(String userName);

    Boolean existsByEmail(String email);

    User findByEmail(String email);

}
