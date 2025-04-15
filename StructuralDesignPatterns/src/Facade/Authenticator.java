package Facade;

public class Authenticator {
    Authenticator(){

    }

    public static boolean authenticate(String user){
        if("Staffy".equals(user)){
            return true;
        }
        return false;
    }
}
