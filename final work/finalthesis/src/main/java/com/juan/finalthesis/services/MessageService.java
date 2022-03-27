package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.MessageRepository;
import com.juan.finalthesis.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageRepository repository;

    public Message save(Message message) {
        return repository.save(message);
    }
}
