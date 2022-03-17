package com.juan.topic6.service;

import com.juan.topic6.model.Transaction;
import com.juan.topic6.repositories.TransactionRepository;
import com.juan.topic6.rest.TransactionRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction makeTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
