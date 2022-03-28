package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.InboxRepository;
import com.juan.finalthesis.model.Inbox;
import com.juan.finalthesis.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InboxService {

    @Autowired
    InboxRepository inboxRepository;

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

}