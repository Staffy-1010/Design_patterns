package AbstractFactory.SuperMart;

import AbstractFactory.SuperMart.Grocery.GroceryProducts;
import AbstractFactory.SuperMart.Junk.JunkProducts;
import AbstractFactory.SuperMart.Milk.DairyProducts;

public abstract class Mart implements JunkProducts, GroceryProducts, DairyProducts {

}
