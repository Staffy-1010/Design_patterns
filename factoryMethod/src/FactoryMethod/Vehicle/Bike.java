package FactoryMethod.Vehicle;

public class Bike extends Vehicle{

    @Override
    public void Color() {
        System.out.println("Blue");
    }

    @Override
    public void Wheels() {
        System.out.println("2");
    }
}
