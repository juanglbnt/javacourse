package com.juan.factoryMethod;

public class PepperoniPizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for pepperoni pizza");
    }
}
