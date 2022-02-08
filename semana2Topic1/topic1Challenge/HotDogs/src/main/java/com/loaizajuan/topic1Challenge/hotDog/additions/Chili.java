package com.loaizajuan.topic1Challenge.hotDog.additions;

import com.loaizajuan.topic1Challenge.hotDog.components.BaseHotDog;

public class Chili extends BaseHotDog {
    BaseHotDog hotDog;

    public Chili(BaseHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + "chili mexicano\n";
    }

    @Override
    public double cost() {
        return 6 + hotDog.cost();
    }
}
