package StrategyHandsOn;

public class VehicleFactory {
    public void vehicleFeature(String request){
        if("Car".equals(request)){
            Vehicle v = new Car();
            v.getFeatures();
        }
        else if("Bike".equals(request)){
            Vehicle v = new Bike();
            v.getFeatures();
        }
        else if("Cycle".equals(request)){
            Vehicle v = new Cycle();
            v.getFeatures();
        }
        else{
            throw new IllegalArgumentException("No vehicle");
        }
    }

}
