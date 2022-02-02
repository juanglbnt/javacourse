package com.juan.challenge1.OnlineStore.product;

public interface Subject {
    void registerUser(Observer observer);
    void deleteUser(Observer observer);
    void notifyUsers(Observer observer);
    void setPrice(Observer user, double newPrice);
}
