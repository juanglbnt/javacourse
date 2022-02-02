package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Pinneaple extends BaseHotDog {
    BaseHotDog hotDog;

    public Pinneaple(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "piña caramelizada\n";
    }

    @Override
    public double cost() {
        return 6 + hotDog.cost();
    }
}
