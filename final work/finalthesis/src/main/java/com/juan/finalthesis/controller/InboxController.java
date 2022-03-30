package com.juan.finalthesis.controller;

import com.juan.finalthesis.model.Inbox;
import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import com.juan.finalthesis.services.InboxService;
import com.juan.finalthesis.services.MessageService;
import com.juan.finalthesis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/inbox")
public class InboxController {

    @Autowired
    InboxService inboxService;
    @Autowired
    MessageService messageService;
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String inbox(Model model) {
        List<Inbox> inboxMessages = inboxService.findAll();
        List<Inbox> inboxOfUser = inboxService.findByReceiver(userService.userLoggedAsUserObject());
        model.addAttribute("title", "Inbox");
        model.addAttribute("inbox", inboxOfUser);
        System.out.println(userService.getUserLogged());
        System.out.println(userService.userLoggedAsUserObject());
        return "/views/inbox";
    }

    @GetMapping("/copy/{identifier}")
    public String sendCopy(@PathVariable("identifier") String identifier, Model model) {
        List<User> users = userService.getAllUser();
        Message message = messageService.findByIdentifier(identifier);
        model.addAttribute("title", "Send Copy");
        model.addAttribute("users", users);
        model.addAttribute("message", message);
        return "/views/copy";
    }

    @PostMapping("/sendCopy")
    public String sendCopy(@ModelAttribute Message message) {
        inboxService.copyMessage(message);
        return "redirect:/views/sent";
    }

}