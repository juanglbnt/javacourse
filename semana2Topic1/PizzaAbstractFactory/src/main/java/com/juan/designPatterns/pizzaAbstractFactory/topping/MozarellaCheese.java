package com.juan.designPatterns.pizzaAbstractFactory.topping;

public class MozarellaCheese implements Cheese{

    public MozarellaCheese(){
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("preparing some delicious mozarella cheese");
    }
}
