package com.juan.designPatterns.BuilderPatternHouseExample;

import builders.ConcreteHouseBuilder;
import builders.HouseBuilder;
import builders.PrefabricatedHouse;
import com.juan.designPatterns.BuilderPatternHouseExample.product.House;
import director.ConstructionEngineer;
import org.junit.Test;

public class ConstructionEngineerTest {

    @Test
    public void testConstructHouse(){
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("house is: " + houseA);
        //another house
        PrefabricatedHouse prefabricatedHouse = new PrefabricatedHouse();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouse);
        House houseB = engineerB.constructHouse();
        System.out.println("house is: " + houseB);
    }
}
