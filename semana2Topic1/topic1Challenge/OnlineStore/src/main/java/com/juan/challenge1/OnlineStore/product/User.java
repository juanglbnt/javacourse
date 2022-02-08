package com.juan.challenge1.OnlineStore.product;

public class User implements Observer{
    String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String productName, double price) {
        System.out.println("hola " + name + " hemos actualizado nuestros precios " + productName
        + " $: " + price);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
