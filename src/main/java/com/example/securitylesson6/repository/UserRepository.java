package com.example.securitylesson6.repository;

import com.example.securitylesson6.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByEmail(String email);
}
