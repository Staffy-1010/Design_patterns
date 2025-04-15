package FactoryMethod.Vehicle;

public class Cycle extends Vehicle {
    @Override
    public void Wheels(){
        System.out.println("2");
    }

    @Override
    public void Color() {
        System.out.println("white");
    }
}
