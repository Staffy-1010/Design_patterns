package StrategyHandsOn;

public class Bike extends Vehicle {
    Bike() {
        super(new TwoWheels(),new WhiteColor());
    }
}
