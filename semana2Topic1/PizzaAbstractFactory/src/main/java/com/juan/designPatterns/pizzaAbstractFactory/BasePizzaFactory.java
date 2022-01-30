package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}
