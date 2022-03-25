package com.juan.finalthesis.controller;

import com.juan.finalthesis.model.User;
import com.juan.finalthesis.services.UserSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {

    @Autowired
    UserSerrvice serrvice;

    @Autowired
    User userToRecord;

    @GetMapping("/")
    public String create(Model model) {
        model.addAttribute("title", "New User");
        model.addAttribute("user", userToRecord);
        return "/views/registration";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute User user) {
        serrvice.save(user);
        return "redirect:home";
    }
}
