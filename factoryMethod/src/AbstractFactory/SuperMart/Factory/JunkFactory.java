package AbstractFactory.SuperMart.Factory;

import AbstractFactory.SuperMart.Junk.BurgerProduct;
import AbstractFactory.SuperMart.Junk.PizzaProduct;
import AbstractFactory.SuperMart.Mart;

public class JunkFactory extends SuperMartFactory {
    public Mart getJunkBurger() {
        return new BurgerProduct();
    }
    public Mart getJunkPizza() {
        return new PizzaProduct();
    }
}
