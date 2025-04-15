package Decorator;

public class Jalapeno extends PizzaToppingsDecorator{
    Pizza pizza;
    Jalapeno(Pizza p){
        this.pizza = p;
    }

    @Override
    public int cost(){
        return this.pizza.cost() + 30;
    }
}
