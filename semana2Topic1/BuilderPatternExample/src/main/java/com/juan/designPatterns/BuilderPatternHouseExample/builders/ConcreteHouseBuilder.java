package com.juan.designPatterns.BuilderPatternHouseExample.builders;

import com.juan.designPatterns.BuilderPatternHouseExample.product.House;

public class ConcreteHouseBuilder implements HouseBuilder{
    private House house;

    public ConcreteHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("concrete, brick, stone");
        System.out.println("ConcreteHouseBuilder: foundation complete...");
    }

    @Override
    public void buildStructure() {
        house.setStructure("concrete, mortar, brick, reinforced steel");
        System.out.println("ConcreteHouseBuilder: structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("concrete, reinforced steel");
        System.out.println("ConcreteHouseBuilder: roof complete...");
    }

    @Override
    public void paintHouse() {
        house.setPainted(true);
        System.out.println("ConcreteHouseBuilder: painting complete...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("ConcreteHouseBuilder: furnishing complete...");
    }

    @Override
    public House getHouse() {
        System.out.println("ConcreteHouseBuilder: concrete house complete...");
        return this.house;
    }
}
