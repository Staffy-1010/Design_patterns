package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<String> items;
    List<Observers> observersList;

    Store(List<String> items){
        this.items = new ArrayList<>(items);
        this.observersList = new ArrayList<>();
    }

    public void addItem(String item){
        items.add(item);
        notifyMethod(item);
    }

    public void register(Observers o){
        observersList.add(o);
    }

    public void notifyMethod(String item){
        for(Observers o : observersList){
            o.update(item);
        }
    }
}
