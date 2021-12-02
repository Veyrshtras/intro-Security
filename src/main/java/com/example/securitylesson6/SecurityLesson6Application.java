package com.example.securitylesson6;

import com.example.securitylesson6.repository.impl.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
public class SecurityLesson6Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityLesson6Application.class, args);
    }

}
