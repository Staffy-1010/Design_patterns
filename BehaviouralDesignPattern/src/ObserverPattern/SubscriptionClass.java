package ObserverPattern;

import java.util.List;

public class SubscriptionClass extends Store implements Observers{

    SubscriptionClass(List l) {
        super(l);
    }

    public void subscribe() {
        register(this);
    }

    @Override
    public void update(String item) {
        System.out.println("sending email to o for new item : " + item);
    }
}
