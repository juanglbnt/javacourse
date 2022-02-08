package com.loaizajuan.topic1Challenge.hotDog.components;

public class HotDog extends BaseHotDog{

    public HotDog(){
        description = "hot dog basico con pan y salchicha\n";
    }

    @Override
    public double cost() {
        return 8;
    }
}
