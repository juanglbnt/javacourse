package com.juan.topic6.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transaction")
@Builder
@Data
public class Transaction implements Serializable {

    @Id
    Long id;
    double amount;

    @ManyToOne
    @JoinColumn(name = "account")
    Account account;

    @ManyToOne
    @JoinColumn(name = "destination_account")
    Account destinationAccount;

    public Transaction() {
    }

    public Transaction(Long id, double amount, Account account, Account destinationAccount) {
        this.id = id;
        this.amount = amount;
        this.account = account;
        this.destinationAccount = destinationAccount;
    }
}
