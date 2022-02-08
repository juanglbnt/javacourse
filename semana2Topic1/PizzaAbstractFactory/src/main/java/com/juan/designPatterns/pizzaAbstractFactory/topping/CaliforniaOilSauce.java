package com.juan.designPatterns.pizzaAbstractFactory.topping;

public class CaliforniaOilSauce implements Sauce{

    public CaliforniaOilSauce(){
        preparingSauce();
    }

    @Override
    public void preparingSauce() {
        System.out.println("preparing classical california sauce");
    }
}
