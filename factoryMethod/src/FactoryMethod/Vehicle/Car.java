package FactoryMethod.Vehicle;

public class Car extends Vehicle {

    @Override
    public void Color() {
        System.out.println("green");
    }

    @Override
    public void Wheels() {
        System.out.println("4");
    }
}
