package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.product.CheesePizza;
import com.juan.designPatterns.pizzaAbstractFactory.product.PepperoniPizza;
import com.juan.designPatterns.pizzaAbstractFactory.product.Pizza;
import com.juan.designPatterns.pizzaAbstractFactory.product.VeggiePizza;

public class GourmetPizzaFactory extends BasePizzaFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
        switch (type){
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("no such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
