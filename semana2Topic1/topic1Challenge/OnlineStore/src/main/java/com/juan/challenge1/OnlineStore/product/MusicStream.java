package com.juan.challenge1.OnlineStore.product;

import java.util.ArrayList;

public class MusicStream implements Subject{
    private ArrayList<Observer> users = new ArrayList<>();
    private static final String DESCRIPTION = "MUSIC STREAM SUSCRIPCION MENSUAL";
    private double price = 125.45;
    private Observer user;

    public MusicStream(){}
    public MusicStream(double PRICE) {
        this.price = PRICE;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void registerUser(Observer observer) {
        users.add(observer);
    }

    @Override
    public void deleteUser(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyUsers();
    }

    @Override
    public void notifyUsers() {
        System.out.println("Hemos actualizado nuestros precios");
        for(Observer ob : users){
            ob.update(DESCRIPTION, price);
        }
    }
}
