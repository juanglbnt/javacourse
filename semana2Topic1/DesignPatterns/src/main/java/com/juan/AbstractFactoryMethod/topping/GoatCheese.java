package com.juan.AbstractFactoryMethod.topping;

import com.juan.AbstractFactoryMethod.topping.Cheese;

public class GoatCheese implements Cheese {

    public GoatCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("preparing goat cheese");
    }
}
