package com.juan.designPatterns.pizzaAbstractFactory.product;

import com.juan.designPatterns.pizzaAbstractFactory.BaseToppingFactory;

public class VeggiePizza extends Pizza{
    BaseToppingFactory toppingFactory;
    public VeggiePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("preparing ingredients for a delicious and healthy veggie pizza");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
