import com.juan.factoryMethod.BasePizzaFactory;
import com.juan.factoryMethod.Pizza;
import com.juan.factoryMethod.PizzaFactory;

public class Main {

    public static void main(String[] args) {
        BasePizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza1 = pizzaFactory.createPizza("veggie");
    }
}
