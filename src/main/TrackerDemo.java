package main;
import model.*;
import storage.*;


public class TrackerDemo {
    public static void main(String[] args){
        StorageUnit<Book> bookStorage = new StorageUnit<>();
        bookStorage.addItem(new Book("The Java Way"));

        StorageUnit<Device> deviceStorage = new StorageUnit<>();
        deviceStorage.addItem(new Device("Macbook Air"));

        StorageUnit<Snack> snackStorage = new StorageUnit<>();
        snackStorage.addItem(new Snack("Protein Bar", false));

        StorageUtils.displayItem(bookStorage.getItem()); // generic method
        StorageUtils.printItems(java.util.Arrays.asList(
                bookStorage.getItem(),
                deviceStorage.getItem(),
                snackStorage.getItem()
        )); // wildcard method
        StorageUtils.checkPerishable(snackStorage.getItem()); // Bounded type method



    }
}
