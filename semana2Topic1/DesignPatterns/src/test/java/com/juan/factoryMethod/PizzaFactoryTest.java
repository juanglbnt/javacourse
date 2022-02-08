package com.juan.factoryMethod;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class PizzaFactoryTest {

    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");

       // assertEquals("");
    }

}