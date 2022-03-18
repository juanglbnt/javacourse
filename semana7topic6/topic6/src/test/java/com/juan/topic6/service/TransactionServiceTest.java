package com.juan.topic6.service;

import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.exceptions.InvalidTargetException;
import com.juan.topic6.model.Account;
import com.juan.topic6.model.Bank;
import com.juan.topic6.model.Transaction;
import com.juan.topic6.model.User;
import com.juan.topic6.repositories.TransactionRepository;
import com.juan.topic6.rest.TransactionRest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;
    @Mock
    private TransactionRest transactionRest;

    @InjectMocks
    private TransactionService transactionService;

    @Autowired
    private Transaction transaction;
    @Autowired
    private Transaction transaction2;
    private Transaction transaction3;
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

        transaction2 = new Transaction();
        transaction2.setAccount(account1);
        transaction2.setDestinationAccount(account2);
        transaction2.setAmount(300000);

        transaction3 = new Transaction();
        transaction3.setAccount(account1);
        transaction3.setDestinationAccount(account2);
        transaction3.setAmount(10000);
    }

    @Test
    public void transactionMustFailNotSufficientFunds() {
        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction2);
        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class,
                () -> transactionService.makeTransaction(transaction2));

        Assertions.assertEquals(transactionService.INSUFFICIENT_FUNDS_MESSAGE, ex.getMessage());
    }

    @Test
    public void accountTypeCaseFail() {
        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction3);
        InvalidTargetException ex = Assertions.assertThrows(InvalidTargetException.class,
                () -> transactionService.makeTransaction(transaction3));

        Assertions.assertEquals(transactionService.INVALID_TARGET_EXCEPTION_MESSAGE, ex.getMessage());

    }
}