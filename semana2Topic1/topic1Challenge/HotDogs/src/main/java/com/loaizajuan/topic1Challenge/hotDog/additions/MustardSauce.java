package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class MustardSauce extends BaseHotDog {
    BaseHotDog hotDog;

    public MustardSauce(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "mostaza\n";
    }

    @Override
    public double cost() {
        return 1 + hotDog.cost();
    }
}
