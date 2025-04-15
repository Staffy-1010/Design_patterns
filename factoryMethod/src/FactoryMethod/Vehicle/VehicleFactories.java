package FactoryMethod.Vehicle;

public class VehicleFactories extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
