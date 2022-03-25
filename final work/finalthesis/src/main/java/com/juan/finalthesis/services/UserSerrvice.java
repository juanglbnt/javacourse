package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.UserRepository;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerrvice {

    @Autowired
    UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }
}
