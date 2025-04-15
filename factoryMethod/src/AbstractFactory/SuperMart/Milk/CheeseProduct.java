package AbstractFactory.SuperMart.Milk;

import AbstractFactory.SuperMart.Mart;

public class CheeseProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("cheese");
    }
}
