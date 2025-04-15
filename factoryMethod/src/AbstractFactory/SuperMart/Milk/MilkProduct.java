package AbstractFactory.SuperMart.Milk;

import AbstractFactory.SuperMart.Mart;

public class MilkProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("milk");
    }
}
