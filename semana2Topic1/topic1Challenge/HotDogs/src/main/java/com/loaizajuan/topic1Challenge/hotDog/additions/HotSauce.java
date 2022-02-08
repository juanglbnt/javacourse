package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class HotSauce extends BaseHotDog {
    BaseHotDog hotDog;

    public HotSauce(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "salsa picante\n";
    }

    @Override
    public double cost() {
        return 1 + hotDog.cost();
    }
}
