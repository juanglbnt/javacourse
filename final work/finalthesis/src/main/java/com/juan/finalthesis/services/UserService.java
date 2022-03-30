package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.UserRepository;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);

    public User save(User user) {
        user.setEnable(true);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

    public List<User> getAllUser() {
        return repository.findAll();
    }

    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public String getUserLogged() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = null;
        if(principal instanceof UserDetails) {
            userDetails = (UserDetails) principal;
        }
        String userLogged = userDetails.getUsername();
        return userLogged;
    }

    public User userLoggedAsUserObject() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = null;
        if(principal instanceof UserDetails) {
            userDetails = (UserDetails) principal;
        }
        String userLogged = userDetails.getUsername();

        User currentUser = findByUsername(userLogged);
        return currentUser;
    }

    /*@PostConstruct
    public void init() {
        Authentication auth = SecurityContextHolder
                .getContext()
                .getAuthentication();
        UserDetails userDetail = (UserDetails) auth.getPrincipal();
        User user = findByUsername(userDetail.getUsername());
        System.out.println(user);
        System.out.println(user.getUsername());
    }*/
}
