package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Jalapeno(new PeppyPaneer());
        System.out.println(pizza.cost() + new VegLoaded().cost());
    }
}
