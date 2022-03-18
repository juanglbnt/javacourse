package com.juan.topic6.pruebas;

import com.juan.topic6.model.Account;
import com.juan.topic6.model.Bank;
import com.juan.topic6.model.Payment;
import com.juan.topic6.model.User;
import com.juan.topic6.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

public class Prueba1 {

    PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {
        Prueba1 prueba1 = new Prueba1();
        prueba1.pruebaIdBill();
    }

    public void pruebaIdBill() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(250000).user(user1).bank(bank1).build();
        Payment payment1 = Payment.builder().id(123).billId("0082734").companyId(1).expirationDate("12-11-10").amount(190000).account(account1).build();

    }
}
