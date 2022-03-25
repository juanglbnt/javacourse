package com.juan.finalthesis.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
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

    @ManyToOne
    @JoinColumn(name = "receptor")
    private User receptor;

    public Message() {

    }

    public Message(Long id, String subject, String body, User sender, User receptor) {
        this.id = id;
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.receptor = receptor;
    }
}
