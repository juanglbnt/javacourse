package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Builder
@Component
@Table(name = "inbox")
public class Inbox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier;
    private String subject;
    private String body;
    private String copy;

    @OneToOne
    @JoinColumn(name = "receiver")
    private User receiver;

    @ManyToOne
    @JoinColumn(name = "sender")
    User sender;

    public Inbox() {

    }

    public Inbox(Long id, String identifier, String subject, String body, String copy, User receiver, User sender) {
        this.id = id;
        this.identifier = identifier;
        this.subject = subject;
        this.body = body;
        this.copy = copy;
        this.receiver = receiver;
        this.sender = sender;
    }
}
