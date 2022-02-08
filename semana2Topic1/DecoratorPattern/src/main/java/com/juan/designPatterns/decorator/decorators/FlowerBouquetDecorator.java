package com.juan.designPatterns.decorator.decorators;

import com.juan.designPatterns.decorator.components.FlowerBouquet;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {
    public abstract String getDescription();
}
