package Facade;

public class Transaction {
    double amount;

    Transaction(double amt){
        this.amount = amt;
    }

    public void doTransaction() {

        User user = new User();
        String userName = user.getUser();

        if(Authenticator.authenticate(userName) && amount > 1000){
            System.out.println("Transaction Done");
        }
        System.out.println("**************************************************");

        Pause.doPause(5);

        System.out.println("**************************************************");

        EmailManager.emailManager();

        System.out.println("**************************************************");
    }
}
