package com.juan.AbstractFactoryMethod;

import com.juan.AbstractFactoryMethod.topping.Cheese;
import com.juan.AbstractFactoryMethod.topping.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
