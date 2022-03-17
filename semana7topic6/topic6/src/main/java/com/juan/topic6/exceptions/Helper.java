package com.juan.topic6.exceptions;

public class Helper {

    public Helper() {

    }

    public void validFunds(double funds, double necessaryFunds) throws InsufficientFundsException{
        if(necessaryFunds > funds) {
            throw new InsufficientFundsException("InsufficientFundsException: the funds to make" +
                    "the transaction are not enough");
        }
    }
}
