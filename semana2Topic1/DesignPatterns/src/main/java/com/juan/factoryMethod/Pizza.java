package com.juan.factoryMethod;

public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza(){
        System.out.println("pizza baked at 400 for 20 minutes");
    }
}
