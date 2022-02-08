package com.loaizajuan.topic1Challenge.hotDog.components;

public abstract class BaseHotDog {
    String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
