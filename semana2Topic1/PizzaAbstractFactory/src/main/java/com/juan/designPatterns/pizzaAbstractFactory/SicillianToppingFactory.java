package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.topping.Cheese;
import com.juan.designPatterns.pizzaAbstractFactory.topping.MozarellaCheese;
import com.juan.designPatterns.pizzaAbstractFactory.topping.Sauce;
import com.juan.designPatterns.pizzaAbstractFactory.topping.TomatoSauce;

public class SicillianToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
