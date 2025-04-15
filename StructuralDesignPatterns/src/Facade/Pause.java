package Facade;

public class Pause {
    int n;

    Pause(){

    }

    public static void doPause(int time){
        for(int i=0;i<time;i++){
            System.out.println("Waiting........");
        }
    }
}
