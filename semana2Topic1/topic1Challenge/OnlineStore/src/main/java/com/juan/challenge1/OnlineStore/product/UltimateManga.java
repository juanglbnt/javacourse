package com.juan.challenge1.OnlineStore.product;

import java.util.ArrayList;

public class UltimateManga implements Subject{
    private ArrayList<Observer> users = new ArrayList<>();
    private static final String DESCRIPTION = "MANGAS ILIMITADOS MENSUAL";
    private double price = 170;
    private Observer user;

    public UltimateManga(double price) {
        this.price = price;
    }

    public UltimateManga(){

    }

    @Override
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
    public void setPrice(double price) {
        this.price = price;
        notifyUsers();
    }

    @Override
    public void notifyUsers() {
        System.out.println("hemos cambiado los precios");
        for(Observer ob : users){
            ob.update(DESCRIPTION, price);
        }
    }
}
