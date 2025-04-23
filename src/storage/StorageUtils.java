package storage;

import java.util.List;
import model.Perishable;

public class StorageUtils {

    // Wildcard Method
    public static void printItems(List<? extends Object> items){
        for (Object item: items){
            System.out.println("Item: " + item);
        }
    }

    // Generic method
    public static <T> void displayItem(T item){
        System.out.println("Displaying: " + item);
    }

    // Bounded type method
    public static <T extends Perishable> void checkPerishable(T item){
        if (item.isExpired()){
            System.out.println(item  + " is expired ");
        } else{
            System.out.println(item + " is still fresh. ");
        }
    }
}
