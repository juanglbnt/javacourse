package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Fries extends BaseHotDog {
    BaseHotDog hotDog;

    public Fries(BaseHotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "papitas fritas\n";
    }

    @Override
    public double cost() {
        return 2 + hotDog.cost();
    }
}
