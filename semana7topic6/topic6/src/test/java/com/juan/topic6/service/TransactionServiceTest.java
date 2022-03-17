package com.juan.topic6.service;

import com.juan.topic6.model.Account;
import com.juan.topic6.model.Bank;
import com.juan.topic6.model.Transaction;
import com.juan.topic6.model.User;
import com.juan.topic6.repositories.TransactionRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    private TransactionService transactionService;

    @Autowired
    private Transaction transaction;
    @Autowired
    private Account account1;
    @Autowired
    private Account account2;
    @Autowired
    private Bank globantBank;
    @Autowired
    private Bank interBank;
    @Autowired
    private User user1;
    @Autowired
    private User user2;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        interBank = new Bank();
        interBank.setId(6);
        interBank.setName("inter Bank");
        globantBank = new Bank();
        globantBank.setId(5);
        globantBank.setName("banco globant");

        user1 = new User();
        user1.setName("juan");
        user1.setLastName("zapata");
        user1.setDocNumber(18282);

        user2 = new User();
        user2.setName("laura");
        user2.setLastName("rodriguez");
        user2.setDocNumber(991881);

        account1 = new Account();
        account1.setFunds(270000);
        account1.setType("AHORROS");
        account1.setBank(globantBank);
        account1.setUser(user1);

        account2 = new Account();
        account2.setBank(interBank);
        account2.setUser(user2);
        account2.setFunds(50000);
        account2.setType("CORRIENTE");

        transaction = new Transaction();
        transaction.setAccount(account1);
        transaction.setDestinationAccount(account2);
        transaction.setAmount(100000);
    }

    @Test
    public void transactionSuccess() {
        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        assertNotNull(transactionService.makeTransaction(new Transaction()));
    }
}