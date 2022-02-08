package com.juan.factoryMethod;

public class VeggiePizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for veggie pizza");
    }
}
