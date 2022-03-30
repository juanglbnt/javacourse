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
}
