package model;

public class Perishable {
    private boolean isExpired;

    //constructor
    public Perishable(boolean isExpired){
        this.isExpired = isExpired;
    }

    //method
    public boolean isExpired(){
        return isExpired;
    }
    //override
    @Override
    public String toString(){
        return "Perishable [isExpired=" + isExpired + "]";
    }

}
