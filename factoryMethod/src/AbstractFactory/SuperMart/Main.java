package AbstractFactory.SuperMart;

import AbstractFactory.SuperMart.Factory.JunkFactory;
import AbstractFactory.SuperMart.Factory.SuperMartFactory;
import AbstractFactory.SuperMart.Junk.JunkProducts;

public class Main {
    public static void main(String...args){
        SuperMartFactory sf = new JunkFactory();
        JunkProducts[] jf = sf.doShopping();
        jf[0].giveProducts();
    }
}
