package AbstractFactory.SuperMart.Junk;

import AbstractFactory.SuperMart.Mart;

public class BurgerProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("burger");
    }
}
