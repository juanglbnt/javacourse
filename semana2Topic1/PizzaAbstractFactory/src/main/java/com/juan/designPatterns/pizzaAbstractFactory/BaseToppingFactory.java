package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.topping.Cheese;
import com.juan.designPatterns.pizzaAbstractFactory.topping.Sauce;

public abstract class BaseToppingFactory {
public abstract Cheese createCheese();
public abstract Sauce createSauce();
}
