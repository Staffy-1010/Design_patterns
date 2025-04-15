package FactoryMethod.Vehicle;

public abstract class VehicleFactory {
    public Vehicle getVehicle(){
        Vehicle vb = createVehicle();
        return vb;
    }

    public abstract Vehicle createVehicle();
}
