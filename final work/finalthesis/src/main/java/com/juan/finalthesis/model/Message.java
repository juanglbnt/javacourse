package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Data
@Builder
@Component
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier;
    private String subject;
    private String body;
    private String copy;

    @ManyToOne
    @JoinColumn(name = "sender")
    private User sender;

    @OneToOne
    @JoinColumn(name = "receiver")
    private User receiver;

    public Message() {

    }

    public Message(Long id, String identifier, String subject, String body, String copy, User sender, User receiver) {
        this.id = id;
        this.identifier = identifier;
        this.subject = subject;
        this.body = body;
        this.copy = copy;
        this.sender = sender;
        this.receiver = receiver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
