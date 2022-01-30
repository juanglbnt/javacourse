package com.juan.AbstractFactoryMethod.topping;

import com.juan.AbstractFactoryMethod.topping.Cheese;

public class MozarellaCheese implements Cheese {

    public MozarellaCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("preparing mozarella cheese");
    }
}
