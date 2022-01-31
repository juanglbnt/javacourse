package com.juan.designPatterns.BuilderPatternHouseExample;

import com.juan.designPatterns.BuilderPatternHouseExample.builders.ConcreteHouseBuilder;
import com.juan.designPatterns.BuilderPatternHouseExample.builders.HouseBuilder;
import com.juan.designPatterns.BuilderPatternHouseExample.builders.PrefabricatedHouse;
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
