package StrategyHandsOn;

public class Vehicle {
    Wheels w;
    Color c;

    Vehicle(Wheels w, Color c){
        this.w = w;
        this.c = c;
    }

    public void getFeatures(){
        w.wheels();
        c.color();
    }
}
