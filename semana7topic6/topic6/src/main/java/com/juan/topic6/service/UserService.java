package com.juan.topic6.service;

import com.juan.topic6.model.User;
import com.juan.topic6.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public <U extends User> U save(U user) {
        return userRepository.save(user);
    }
}
