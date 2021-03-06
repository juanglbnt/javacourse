package com.juan.finalthesis.services;

import com.juan.finalthesis.Relpositories.MessageRepository;
import com.juan.finalthesis.model.Message;
import com.juan.finalthesis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository repository;
    @Autowired
    InboxService inboxService;
    @Autowired
    UserService userService;

    //!!! CAMBIOS AQUI REVISAR
    public Message save(Message message) {
        message.setSender(userService.userLoggedAsUserObject());
        message.setIdentifier(generateIdentifier());
        message.setCopy("PRIMARY");
        inboxService.copyMessage(message);
        return repository.save(message);
    }

    public List<Message> sent() {
        return repository.findAll();
    }

    public List<Message> findBySender(User sender) {
        return repository.findBySender(sender);
    }

    public Message findByIdentifier(String identifier) {
        return repository.findByIdentifier(identifier);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public String generateIdentifier() {
        final int SIZE = 10;
        final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder stringBuilder = new StringBuilder(SIZE);

        for (int i = 0; i < SIZE; i++) {
            int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());

            stringBuilder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }

        return stringBuilder.toString();
    }
}
