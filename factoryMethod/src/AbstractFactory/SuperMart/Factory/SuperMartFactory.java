package AbstractFactory.SuperMart.Factory;

import AbstractFactory.SuperMart.Junk.JunkProducts;

public abstract class SuperMartFactory {

    public JunkProducts[] doShopping(){
        JunkProducts jf = getJunkBurger();
        JunkProducts jf2 = getJunkPizza();
        return new JunkProducts[]{jf, jf2};
    }
    public abstract JunkProducts getJunkBurger();
    public abstract JunkProducts getJunkPizza();
}
