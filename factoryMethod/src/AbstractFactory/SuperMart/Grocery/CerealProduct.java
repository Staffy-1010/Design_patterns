package AbstractFactory.SuperMart.Grocery;

import AbstractFactory.SuperMart.Mart;

public class CerealProduct extends Mart {
    @Override
    public void giveProducts() {
        System.out.println("cereal");
    }
}
