package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.InboxRepository;
import com.juan.finalthesis.model.Inbox;
import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InboxService {

    @Autowired
    InboxRepository inboxRepository;
    @Autowired
    UserService userService;

    public void copyMessage(Message message) {
        Inbox inboxGenerate = new Inbox();
        inboxGenerate.setIdentifier(message.getIdentifier());
        inboxGenerate.setSender(message.getSender());
        inboxGenerate.setSubject(message.getSubject());
        inboxGenerate.setBody(message.getBody());
        inboxGenerate.setReceiver(message.getReceiver());
        inboxGenerate.setCopy(message.getCopy());
        save(inboxGenerate);
    }

    public Inbox save(Inbox inbox){
        return inboxRepository.save(inbox);
    }

    public List<Inbox> findAll() {
        return inboxRepository.findAll();
    }

    public List<Inbox> findByReceiver(User receiver) {
        return inboxRepository.findByReceiver(receiver);
    }

    public void delete(Long id) {
        inboxRepository.deleteById(id);
    }

    public String receiversOfOneMessage(String identifier) {
        String receivers = "";
        List<Inbox> messages = inboxRepository.findAllWithSameIdentifier(identifier);

        for (int i = 0; i < messages.size(); i++) {
            receivers += messages.get(i).getReceiver().getUsername();
        }

        return receivers;
    }
}