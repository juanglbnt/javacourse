package com.juan.challenge1.OnlineStore.product;

import java.util.ArrayList;

public class AmazingVideo implements Subject{
    private ArrayList<Observer> users = new ArrayList<>();
    private static final String DESCRIPTION = "PELICULAS Y SERIES SUSCRIPCION MENSUAL";
    private double price = 290.5;
    private Observer user;

    public AmazingVideo(double price){
        this.price = price;
    }

    public AmazingVideo(){

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyUsers();
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
    public void notifyUsers() {
        System.out.println("hemos actualizado el precio");
        for(Observer ob : users){
            ob.update(DESCRIPTION, price);
        }
    }
}
