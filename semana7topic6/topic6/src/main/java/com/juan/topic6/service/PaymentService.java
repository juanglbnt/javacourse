package com.juan.topic6.service;

import com.juan.topic6.exceptions.InsufficientFundsException;
import com.juan.topic6.exceptions.InvalidBillIdException;
import com.juan.topic6.exceptions.InvalidTargetException;
import com.juan.topic6.model.Payment;
import com.juan.topic6.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {

    public final String INSUFFICIENT_FUNDS_MESSAGE = "the funds are not enough to pay the bill";
    public final String INVALID_TARGET_MESSAGE = "invalid bill id";

    @Autowired
    PaymentRepository paymentRepository;

    public Payment makePayment(Payment payment) {
        double funds = payment.getAccount().getFunds();
        double amount = payment.getAmount();
        String billId = payment.getBillId();
        String accountType = payment.getAccount().getType();
        double discount = (accountType.equals("CORRIENTE")) ? (amount*0.1) : 0;

        if (isValidId(billId)) {
            if(!accountIsValidToPayment(amount, funds)) {
                throw new InsufficientFundsException(INSUFFICIENT_FUNDS_MESSAGE);
            } else {
                return paymentRepository.save(payment);
            }
        } else {
            throw new InvalidBillIdException(INVALID_TARGET_MESSAGE);
        }

    }

    public boolean accountIsValidToPayment(double mount, double funds) {
        double base = mount + (mount * 0.2);
        return funds >= base;
    }

    public boolean isValidId(String billId) {
        return billId.charAt(0) == '0' && billId.charAt(1) == '0'
                && billId.length() == 7;
    }
}
