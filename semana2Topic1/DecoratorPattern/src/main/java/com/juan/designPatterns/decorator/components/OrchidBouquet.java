package com.juan.designPatterns.decorator.components;

public class OrchidBouquet extends FlowerBouquet{

    public OrchidBouquet(){
        description = "orchid bouquet";
    }

    @Override
    public double cost() {
        return 29.0;
    }
}
