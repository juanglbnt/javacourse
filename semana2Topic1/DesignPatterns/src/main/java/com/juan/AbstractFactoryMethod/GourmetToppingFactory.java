package com.juan.AbstractFactoryMethod;

import com.juan.AbstractFactoryMethod.topping.CaliforniaOilSauce;
import com.juan.AbstractFactoryMethod.topping.Cheese;
import com.juan.AbstractFactoryMethod.topping.GoatCheese;
import com.juan.AbstractFactoryMethod.topping.Sauce;

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
