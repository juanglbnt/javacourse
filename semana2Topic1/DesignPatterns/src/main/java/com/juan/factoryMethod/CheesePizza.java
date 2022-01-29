package com.juan.factoryMethod;

public class CheesePizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for cheese pizza");
    }
}
