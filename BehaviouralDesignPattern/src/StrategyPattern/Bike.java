package StrategyPattern;

public class Bike extends Vehicle {
    Bike() {
        super(new TwoWheels(),new WhiteColor());
    }
}
