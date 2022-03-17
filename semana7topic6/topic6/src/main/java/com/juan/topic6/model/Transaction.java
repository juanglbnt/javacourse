package com.juan.topic6.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transaction")
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
}
