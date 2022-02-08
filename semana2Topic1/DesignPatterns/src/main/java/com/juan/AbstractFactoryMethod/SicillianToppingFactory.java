package com.juan.AbstractFactoryMethod;

import com.juan.AbstractFactoryMethod.topping.Cheese;
import com.juan.AbstractFactoryMethod.topping.MozarellaCheese;
import com.juan.AbstractFactoryMethod.topping.Sauce;
import com.juan.AbstractFactoryMethod.topping.TomatoSauce;

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
