package com.juan.topic6.model;


import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private double funds;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "bank")
    private Bank bank;

    public Account() {
    }

    public Account(Long id, String type, double funds, User user, Bank bank) {
        this.id = id;
        this.type = type;
        this.funds = funds;
        this.user = user;
        this.bank = bank;
    }
}
