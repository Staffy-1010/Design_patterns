package Facade;

public class Main {
    public static void main(String[] args) {
        Transaction t = new Transaction(5000);
        t.doTransaction();
    }
}