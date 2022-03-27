package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@Component
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private String body;

    @ManyToOne
    @JoinColumn(name = "sender")
    private User sender;

    @ManyToMany
    @JoinTable(name = "user_message",
    joinColumns = @JoinColumn(name = "message_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> receptors;

    public Message() {

    }

    public Message(Long id, String subject, String body, User sender, List<User> receptors) {
        this.id = id;
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.receptors = receptors;
    }
}
