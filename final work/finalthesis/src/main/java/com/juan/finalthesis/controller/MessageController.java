package com.juan.finalthesis.controller;

import com.juan.finalthesis.model.Inbox;
import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import com.juan.finalthesis.services.InboxService;
import com.juan.finalthesis.services.MessageService;
import com.juan.finalthesis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    MessageService messageService;
    @Autowired
    UserService userService;
    @Autowired
    Message message;
    @Autowired
    Inbox inbox;

    @GetMapping("/create")
    public String create(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("title", "Send Message");
        model.addAttribute("message", message);
        model.addAttribute("users", users);
        return "/views/send";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Message message) {
        messageService.save(message);
        return "redirect:/messages/sent";
    }

    @GetMapping("/sent")
    public String sent(Model model) {
        List<Message> sentBySender = messageService.findBySender(userService.userLoggedAsUserObject());
        model.addAttribute("title", "sent");
        model.addAttribute("list", sentBySender);
        return "/views/sent";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        messageService.delete(id);
        System.out.println("deleted successfully");
        return "redirect:/messages/sent";
    }
}