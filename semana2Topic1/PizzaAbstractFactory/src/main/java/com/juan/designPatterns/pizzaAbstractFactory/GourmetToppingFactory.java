package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.topping.CaliforniaOilSauce;
import com.juan.designPatterns.pizzaAbstractFactory.topping.Cheese;
import com.juan.designPatterns.pizzaAbstractFactory.topping.GoatCheese;
import com.juan.designPatterns.pizzaAbstractFactory.topping.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory{

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
