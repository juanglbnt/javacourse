package com.juan.topic6.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@Table(name = "payment")
public class Payment {

    @Id
    int id;
    String billId;
    int companyId;
    String expirationDate;
    double amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    Account account;

    public Payment() {
    }

    public Payment(int id, String billId, int companyId, String expirationDate, double amount, Account account) {
        this.id = id;
        this.billId = billId;
        this.companyId = companyId;
        this.expirationDate = expirationDate;
        this.amount = amount;
        this.account = account;
    }
}
