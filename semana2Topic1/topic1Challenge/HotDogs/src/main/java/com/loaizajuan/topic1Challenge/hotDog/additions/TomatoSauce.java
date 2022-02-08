package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class TomatoSauce extends BaseHotDog {
    BaseHotDog hotDog;

    public TomatoSauce(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "salsa de tomate\n";
    }

    @Override
    public double cost() {
        return 1 + hotDog.cost();
    }
}
