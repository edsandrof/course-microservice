package com.edsandrof.hruser.services;

import com.edsandrof.hruser.entities.User;
import com.edsandrof.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
