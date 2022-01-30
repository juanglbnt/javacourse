package com.juan.AbstractFactoryMethod.topping;

public class CaliforniaOilSauce implements Sauce {

    public CaliforniaOilSauce(){
        prepareSauce();
    }

    @Override
    public void prepareSauce() {
        System.out.println("preparing some tasty california oil sauce...");
    }
}
