package ObserverPattern;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SubscriptionClass sc = new SubscriptionClass(List.of("a", "b", "c"));
        sc.subscribe();
        sc.addItem("d");
        sc.addItem("i");
    }
}
