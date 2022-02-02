package com.juan.challenge1.OnlineStore.product;

import java.util.ArrayList;

public class MusicStream implements Subject{
    private ArrayList<Observer> users = new ArrayList<>();
    private static final String NAME = "Music Stream";
    private double price = 125.45;

    public MusicStream(double PRICE) {
        this.price = PRICE;
    }

    @Override
    public void registerUser(Observer user) {
        users.add(user);
    }

    @Override
    public void deleteUser(Observer user) {
        users.add(user);
    }

    @Override
    public void notifyUsers(Observer user) {

    }

    @Override
    public void setPrice(Observer user, double newPrice) {
        price = newPrice;
    }
}
