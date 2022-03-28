package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.UserRepository;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User findByUsername(String username) {
        return repository.getById(username);
    }
}
