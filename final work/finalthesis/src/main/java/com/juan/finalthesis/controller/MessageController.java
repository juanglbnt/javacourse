package com.juan.finalthesis.controller;

import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import com.juan.finalthesis.services.MessageService;
import com.juan.finalthesis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    UserService userService;
    @Autowired
    User user;

    @Autowired
    Message messageToSend;

    @GetMapping("/create")
    public String message(Model model) {
        List<User> listOfUsers = userService.getAllUser();
        model.addAttribute("title", "New Message");
        model.addAttribute("message", messageToSend);
        model.addAttribute("users", listOfUsers);
        model.addAttribute("userSend", user);
        return "/views/send";
    }

    @PostMapping("/send")
    public String send(@ModelAttribute Message message, Model model) {
        message.setReceptors(userService.getAllUser());

        try{
            messageService.save(message);
        }catch (Exception e) {
            model.addAttribute("recipientsErrorMessage", e.getMessage());
        }
        //userService borrarTodos()
        return "redirect:/messages";
    }


    @PostMapping("/addReceiver")
    public void addReceiver() {

    }
}
