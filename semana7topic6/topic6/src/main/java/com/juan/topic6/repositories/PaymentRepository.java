package com.juan.topic6.repositories;

import com.juan.topic6.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment save(Payment payment);

}
