package com.juan.designPatterns.pizzaAbstractFactory.product;

import com.juan.designPatterns.pizzaAbstractFactory.BaseToppingFactory;

public class PepperoniPizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public PepperoniPizza(BaseToppingFactory toppingFactory){
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for good pepperoni pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
