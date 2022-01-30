package com.juan.designPatterns.pizzaAbstractFactory.product;

import com.juan.designPatterns.pizzaAbstractFactory.BaseToppingFactory;

public class CheesePizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public CheesePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for the best cheese pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
