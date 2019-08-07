package com.sales.api.api.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserService, UserDetailsService {

    private final UserRepository repository;

    public UserServiceImpl (UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {

        User user = repository.findByEmail(username).orElseThrow(() -> new RuntimeException("User not found: " + username));
        GrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
        return null;
    }
}
