package com.juan.designPatterns.pizzaAbstractFactory;

import com.juan.designPatterns.pizzaAbstractFactory.product.Pizza;
import org.junit.Test;

public class SicillianPizzaFactoryTest {

    @Test
    public void testCreatePizza() throws Exception{
        BasePizzaFactory pizzaFactory = new SicillianPizzaFactory();
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
    }
}
