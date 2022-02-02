package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Bacon extends BaseHotDog{
    BaseHotDog hotDog;

    public Bacon(BaseHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() +"tocineta\n";
    }

    @Override
    public double cost() {
        return 10 + hotDog.cost();
    }
}
