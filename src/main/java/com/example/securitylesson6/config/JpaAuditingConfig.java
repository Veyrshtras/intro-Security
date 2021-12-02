package com.example.securitylesson6.config;

import com.example.securitylesson6.entity.User;
import com.example.securitylesson6.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
public class JpaAuditingConfig {

    private final UserRepository userRepository;

    public JpaAuditingConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public AuditorAware<User> userAuditorAware(){
        return new AuditorAware<User>() {
            @Override
            public Optional<User> getCurrentAuditor() {
                return Optional.empty();
            }
        };
    }
}
