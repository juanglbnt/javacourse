package com.juan.finalthesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class Login {

    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("title", "Login");
        return "/views/login";
    }
}
