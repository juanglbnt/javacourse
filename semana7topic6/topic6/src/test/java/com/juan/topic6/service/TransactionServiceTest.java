package com.juan.topic6.service;

import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.exceptions.InvalidTargetException;
import com.juan.topic6.model.*;
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

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TransactionServiceTest {

    @Mock
    private TransactionRepository transactionRepository;

    @InjectMocks
    TransactionService transactionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void transactionMustFailNotSufficientFunds() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        Bank bank2 = Bank.builder().id(12).name("universal bank").build();

        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        User user2 = User.builder().id(1429L).name("user2").lastName("user2").docNumber(1982).build();

        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(750000).user(user1).bank(bank1).build();
        Account account2 = Account.builder().id(1999L).type("AHORROS").funds(225000).user(user2).bank(bank2).build();

        Transaction transaction = Transaction.builder().id(1L).amount(750000).account(account1).destinationAccount(account2).build();

        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        InsufficientFundsException ex = Assertions.assertThrows(InsufficientFundsException.class,
                () -> transactionService.makeTransaction(transaction));

        Assertions.assertEquals(transactionService.INSUFFICIENT_FUNDS_MESSAGE, ex.getMessage());
    }

    @Test
    public void accountTypeCaseFailAccountHasTripleTheFunds() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        Bank bank2 = Bank.builder().id(12).name("universal bank").build();

        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        User user2 = User.builder().id(1429L).name("user2").lastName("user2").docNumber(1982).build();

        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(750000).user(user1).bank(bank1).build();
        Account account2 = Account.builder().id(1999L).type("CORRIENTE").funds(350000).user(user2).bank(bank2).build();

        Transaction transaction = Transaction.builder().id(1L).amount(100000).account(account1).destinationAccount(account2).build();

        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        InvalidTargetException ex = Assertions.assertThrows(InvalidTargetException.class,
                () -> transactionService.makeTransaction(transaction));

        Assertions.assertEquals(transactionService.INVALID_TARGET_EXCEPTION_MESSAGE, ex.getMessage());

    }

    @Test
    public void makeTheTransactionSuccessfully() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        Bank bank2 = Bank.builder().id(12).name("universal bank").build();

        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        User user2 = User.builder().id(1429L).name("user2").lastName("user2").docNumber(1982).build();

        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(750000).user(user1).bank(bank1).build();
        Account account2 = Account.builder().id(1999L).type("AHORROS").funds(350000).user(user2).bank(bank2).build();

        Transaction transaction = Transaction.builder().id(1L).amount(100000).account(account1).destinationAccount(account2).build();

        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        assertNotNull(transactionService.makeTransaction(transaction));
    }

    @Test
    public void chargeIfTheBankIsNotGlobantBank() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        Bank bank2 = Bank.builder().id(12).name("universal bank").build();

        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        User user2 = User.builder().id(1429L).name("user2").lastName("user2").docNumber(1982).build();

        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(2000000).user(user1).bank(bank1).build();
        Account account2 = Account.builder().id(1999L).type("AHORROS").funds(350000).user(user2).bank(bank2).build();

        Transaction transaction = Transaction.builder().id(1L).amount(1300000).account(account1).destinationAccount(account2).build();

        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        assertNotNull(transactionService.makeTransaction(transaction));
        Assertions.assertEquals(1303500, transaction.getAmount());

    }

    @Test
    public void ThreePercentCharge() {
        Bank bank1 = Bank.builder().id(5).name("globant bank").build();
        Bank bank2 = Bank.builder().id(12).name("universal bank").build();

        User user1 = User.builder().id(123L).name("user1").lastName("user1").docNumber(12345).build();
        User user2 = User.builder().id(1429L).name("user2").lastName("user2").docNumber(1982).build();

        Account account1 = Account.builder().id(1200L).type("CORRIENTE").funds(2000000).user(user1).bank(bank1).build();
        Account account2 = Account.builder().id(1999L).type("AHORROS").funds(350000).user(user2).bank(bank1).build();

        Transaction transaction = Transaction.builder().id(1L).amount(1600000).account(account1).destinationAccount(account2).build();

        Mockito.when(transactionRepository.save(Mockito.any(Transaction.class))).thenReturn(transaction);
        assertNotNull(transactionService.makeTransaction(transaction));
        Assertions.assertEquals(1552000, transaction.getAmount());

    }
}