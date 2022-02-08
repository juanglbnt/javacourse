package com.juan.designPatterns.decorator.components;

public abstract class FlowerBouquet {
    String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
