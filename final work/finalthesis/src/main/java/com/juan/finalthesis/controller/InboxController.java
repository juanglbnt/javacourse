package com.juan.finalthesis.controller;

import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.services.InboxService;
import com.juan.finalthesis.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inbox")
public class InboxController {

    @Autowired
    InboxService inboxService;
    @Autowired
    MessageService messageService;

    @GetMapping("/copy")
    public String sendCopy(@PathVariable("identifier") String identifier, Model model) {
        Message message = messageService.findByIdentifier(identifier);
        model.addAttribute("title", "Send Copy");
        model.addAttribute("message", message);
        return "";
    }

    @PostMapping("/sendCopy")
    public void sendCopy(@ModelAttribute Message message) {
        inboxService.copyMessage(message);
    }

}
