package com.juan.topic6.service;

import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.exceptions.InvalidBillIdException;
import com.juan.topic6.model.Account;
import com.juan.topic6.model.Bank;
import com.juan.topic6.model.Payment;
import com.juan.topic6.model.User;
import com.juan.topic6.repositories.PaymentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Mock
    PaymentRepository paymentRepository;

    @InjectMocks
    PaymentService paymentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void notSufficientFundsToPayTheBill() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(100000).user(user1).bank(bank1).build();
        Payment payment1 = Payment.builder().id(123).billId("0082734").companyId(1).expirationDate("12-11-10").amount(190000).account(account1).build();

        Mockito.when(paymentRepository.save(Mockito.any(Payment.class))).thenReturn(payment1);
        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class,
        () -> paymentService.makePayment(payment1));

        Assertions.assertEquals(paymentService.INSUFFICIENT_FUNDS_MESSAGE, ex.getMessage());
    }

    @Test
    public void invalidBillCase() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(100000).user(user1).bank(bank1).build();
        Payment payment1 = Payment.builder().id(123).billId("82734").companyId(1).expirationDate("12-11-10").amount(190000).account(account1).build();

        Mockito.when(paymentRepository.save(Mockito.any(Payment.class))).thenReturn(payment1);
        InvalidBillIdException ex = Assertions.assertThrows(InvalidBillIdException.class,
                () -> paymentService.makePayment(payment1));

        Assertions.assertEquals(paymentService.INVALID_TARGET_MESSAGE, ex.getMessage());
    }
}