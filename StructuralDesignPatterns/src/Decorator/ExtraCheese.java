package Decorator;

public class ExtraCheese extends PizzaToppingsDecorator{
    Pizza pizza;

    ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 23;
    }
}
