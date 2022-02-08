package com.juan.designPatterns.decorator.decorators;

import com.juan.designPatterns.decorator.components.FlowerBouquet;

public class Glitter extends FlowerBouquetDecorator{
    FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet){
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }

    @Override
    public double cost() {
        return 4 + flowerBouquet.cost();
    }
}
