package StrategyPattern;

public class Cycle extends Vehicle {

    Cycle() {
        super(new TwoWheels(),new BlueColor());
    }
}
