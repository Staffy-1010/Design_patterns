package AbstractFactory.SuperMart.Junk;

import AbstractFactory.SuperMart.Mart;

public class PizzaProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("pizza");
    }
}
