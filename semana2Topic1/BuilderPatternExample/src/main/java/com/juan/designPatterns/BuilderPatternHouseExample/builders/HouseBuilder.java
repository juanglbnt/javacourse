package com.juan.designPatterns.BuilderPatternHouseExample.builders;

import com.juan.designPatterns.BuilderPatternHouseExample.product.House;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}
