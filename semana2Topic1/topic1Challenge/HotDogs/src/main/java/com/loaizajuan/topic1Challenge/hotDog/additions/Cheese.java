package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Cheese extends BaseHotDog {
    BaseHotDog hotDog;

    public Cheese(BaseHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "queso cheddar fundido\n";
    }

    @Override
    public double cost() {
        return 5 + hotDog.cost();
    }
}
