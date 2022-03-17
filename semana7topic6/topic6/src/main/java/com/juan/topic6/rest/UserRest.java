package com.juan.topic6.rest;

import com.juan.topic6.model.User;
import com.juan.topic6.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRest {

    @Autowired
    private UserService userService;

    @GetMapping
    private String getAllUser(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping
    private ResponseEntity<User> saveUser(@RequestBody User user) {

        try {
            User userSaved = userService.save(user);
            return ResponseEntity.created(new URI("/users/" +
                    userSaved.getId())).body(userSaved);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
