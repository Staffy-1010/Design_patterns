public class Vehicle {
    int id;
    int wheels;
    String color;
    String name;
    String carType;
    String carStorageType;

    Vehicle(VehicleBuilder builder) {
        this.id = builder.id;
        this.wheels = builder.wheels;
        this.color = builder.color;
        this.name = builder.name;
        this.carType = builder.carType;
        this.carStorageType = builder.carStorageType;
    }

    public int getId() {
        return id;
    }

    public int getWheels() {
        return wheels;
    }

    public String getCarStorageType() {
        return carStorageType;
    }

    public String getCarType() {
        return carType;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}
