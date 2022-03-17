package com.juan.topic6.rest;

import com.juan.topic6.exceptions.Helper;
import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.model.Transaction;
import com.juan.topic6.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/transactions")
public class TransactionRest {

    @Autowired
    TransactionService transactionService;

    Helper helper;

    @PostMapping
    public ResponseEntity<Transaction> makeTransaction(@RequestBody Transaction transaction) {
        try {
            Transaction transactionSaved = transactionService.makeTransaction(transaction);
            return ResponseEntity.created(new URI("/transactions/" + transactionSaved.getId())).body(transactionSaved);
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
