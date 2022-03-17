package com.juan.topic6.rest;

import com.juan.topic6.exceptions.Helper;
import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.model.Transaction;
import com.juan.topic6.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionRest {

    @Autowired
    TransactionService transactionService;
    @Autowired
    Helper helper;

    @PostMapping
    private Transaction makeTransaction(@RequestBody Transaction transaction) {
        double amount = transaction.getAmount();
        int bankId = transaction.getDestinationAccount().getBank().getId();
        double finalMount;
        double funds = transaction.getAccount().getFunds();

        finalMount = (bankId == 5) ? amount : amount + 3500;

        try{
            transaction.getAccount().setFunds(funds - finalMount);
            transaction.setAmount(finalMount);
            helper.validFunds(funds, finalMount);
            return transactionService.makeTransaction(transaction);
        }catch (InsufficientFundsException e) {
            System.err.println("FONDOS INSUFICIENTES... INTENTE DE NUEVO");
            return null;
        }
    }
}
