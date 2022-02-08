package com.juan.AbstractFactoryMethod.topping;

import com.juan.AbstractFactoryMethod.topping.Sauce;

public class TomatoSauce implements Sauce {

    public TomatoSauce(){
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("preparing tomato sauce");
    }
}
