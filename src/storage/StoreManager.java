package storage;

import java.util.ArrayList;
import java.util.List;

public class StoreManager<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> getItem(){
        return items;
    }

    public void printAllItems(){
        for (T item: items){
            System.out.println(item);
        }
    }


}
