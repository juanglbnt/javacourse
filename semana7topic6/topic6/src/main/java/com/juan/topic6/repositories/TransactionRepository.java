package com.juan.topic6.repositories;

import com.juan.topic6.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Transaction save(Transaction transaction);

}
