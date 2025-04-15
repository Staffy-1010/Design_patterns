public class VehicleBuilder {
    int id;
    int wheels;
    String color;
    String name;
    String carType;
    String carStorageType;

    public VehicleBuilder getId(int id){
        this.id = id;
        return this;
    }

    public VehicleBuilder getCarStorageType(String carStorageType) {
        this.carStorageType = carStorageType;
        return this;
    }

    public VehicleBuilder getCarType(String carType) {
        this.carType = carType;
        return this;
    }

    public VehicleBuilder getColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder getName(String name) {
        this.name = name;
        return this;
    }

    public VehicleBuilder getWheels(int wheels){
        this.wheels = wheels;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(this);
    }
}
