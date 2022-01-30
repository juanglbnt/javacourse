package com.juan.designPatterns.pizzaAbstractFactory.topping;

public class GoatCheese implements Cheese{

    public GoatCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing goath cheese");
    }
}
