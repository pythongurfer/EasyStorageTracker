package storage;

public class StorageUnit<T> implements Storable<T> {
    private T item;

    // new part of the code to implement the interface methods
    public void save(T item){
        this.item = item;
    }

    public T load(){
        return item;
    }
    // finish the implementation of the interface

    // still keeping the original add/get for backwards compatibility
    public void addItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }


}
