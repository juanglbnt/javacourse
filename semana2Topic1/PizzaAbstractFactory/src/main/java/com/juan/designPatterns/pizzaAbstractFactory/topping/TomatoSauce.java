package com.juan.designPatterns.pizzaAbstractFactory.topping;

public class TomatoSauce implements Sauce{

    public TomatoSauce() {
        preparingSauce();
    }

    @Override
    public void preparingSauce() {
        System.out.println("preparing the napolitan sauce");
    }
}
