package com.juan.designPatterns.decorator.components;

public class RoseBouquet extends FlowerBouquet{

    public RoseBouquet(){
        description = "rose bouquet";
    }

    @Override
    public double cost() {
        return 12.0;
    }
}
