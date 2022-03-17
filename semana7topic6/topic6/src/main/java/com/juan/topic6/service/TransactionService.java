package com.juan.topic6.service;

import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.model.Bank;
import com.juan.topic6.model.Transaction;
import com.juan.topic6.repositories.TransactionRepository;
import com.juan.topic6.rest.TransactionRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public static String INSUFFICIENT_FUNDS_MESSAGE = "The funds to make the transaction are not enough";

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction makeTransaction(Transaction transaction) {
        final double EXCEDENTE = 3500.0;
        double amount = transaction.getAmount();
        double funds = transaction.getAccount().getFunds();
        Bank bank = transaction.getDestinationAccount().getBank();
        double finalAmount = 0.0;

        finalAmount = (bank.getId() == 5) ? amount : amount + EXCEDENTE;
        transaction.setAmount(finalAmount);

        if(finalAmount > funds) {
            throw new InsufficientFundsException(INSUFFICIENT_FUNDS_MESSAGE);
        } else {
            return transactionRepository.save(transaction);
        }

    }
}
