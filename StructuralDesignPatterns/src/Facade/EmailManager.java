package Facade;

public class EmailManager {
    public static void emailManager(){
        System.out.println("Sending an Email");

        Pause.doPause(2);

        System.out.println("Email Sent");
    }
}
