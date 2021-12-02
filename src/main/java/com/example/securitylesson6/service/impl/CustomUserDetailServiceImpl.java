package com.example.securitylesson6.service.impl;

import com.example.securitylesson6.dto.CustomUserDetail;
import com.example.securitylesson6.entity.User;
import com.example.securitylesson6.repository.UserRepository;
import com.example.securitylesson6.service.UserDetailService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailServiceImpl implements UserDetailService {
    private final UserRepository userRepository;

    public CustomUserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user=userRepository.findByEmail(username);
        return user.map(CustomUserDetail::new)
                .orElse(null);
    }

    @Override
    public String password(String pass) {
        return pass;
    }
}
