package com.juan.designPatterns.decorator;

import com.juan.designPatterns.decorator.components.FlowerBouquet;
import com.juan.designPatterns.decorator.components.OrchidBouquet;
import com.juan.designPatterns.decorator.components.RoseBouquet;
import com.juan.designPatterns.decorator.decorators.Glitter;
import com.juan.designPatterns.decorator.decorators.PaperWrapper;
import com.juan.designPatterns.decorator.decorators.RibbonBow;
import org.junit.Test;

public class FlowerBouquetTest {

    @Test
    public void testFlowerBouquet(){
        //without decoration
        FlowerBouquet roseBouquet  = new RoseBouquet();
        System.out.println(roseBouquet.getDescription() + " $ " + roseBouquet.cost());

        //with wrapper paper, ribbon and glitter
        FlowerBouquet decoratedRoseBouquet = new RoseBouquet();
        decoratedRoseBouquet = new PaperWrapper(decoratedRoseBouquet);
        decoratedRoseBouquet = new Glitter(decoratedRoseBouquet);
        decoratedRoseBouquet = new RibbonBow(decoratedRoseBouquet);
        System.out.println(decoratedRoseBouquet.getDescription() + " $ " + decoratedRoseBouquet.cost());

        //orchid with double paper wrapper and ribbon bow
        FlowerBouquet decoratedOrchidBouquet = new OrchidBouquet();
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new PaperWrapper(decoratedOrchidBouquet);
        decoratedOrchidBouquet = new RibbonBow(decoratedOrchidBouquet);
        System.out.println(decoratedOrchidBouquet.getDescription() + " $ " + decoratedOrchidBouquet.cost());
    }
}
