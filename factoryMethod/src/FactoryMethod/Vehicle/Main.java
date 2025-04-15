package FactoryMethod.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vb = new VehicleFactories();
        Vehicle v = vb.getVehicle();
        v.Color();
        v.Wheels();
    }
}