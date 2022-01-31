package com.juan.designPatterns.decorator.decorators;

import com.juan.designPatterns.decorator.components.FlowerBouquet;

public class PaperWrapper extends FlowerBouquetDecorator{
    FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }

    @Override
    public double cost() {
        return 3 + flowerBouquet.cost();
    }
}
