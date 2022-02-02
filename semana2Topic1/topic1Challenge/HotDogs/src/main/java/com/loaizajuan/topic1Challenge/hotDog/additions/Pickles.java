package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Pickles extends BaseHotDog {
    BaseHotDog hotDog;

    public Pickles(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "pepinillos frescos\n";
    }

    @Override
    public double cost() {
        return 5 + hotDog.cost();
    }
}
