package StrategyHandsOn;

public class Car extends Vehicle {
    Car() {
        super(new FourWheels(),new BlueColor());
    }
}
