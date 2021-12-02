package com.example.securitylesson6.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailService {

    UserDetails loadUserByUsername(String username);
}
