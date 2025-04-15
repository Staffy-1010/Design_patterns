package AbstractFactory.SuperMart.Grocery;

import AbstractFactory.SuperMart.Mart;

public class RiceProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("Rice");
    }
}
