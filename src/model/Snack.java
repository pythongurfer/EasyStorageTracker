package model;

public class Snack extends Perishable {
    private String name;

    public Snack(String name, boolean isExpired){
        super(isExpired);
        this.name = name;
    }

    public String toString(){
        return "Snack: " + name + ", expired=" + isExpired();
    }

    public String toJson(){
        return "{\"type\":\"Snack\", \"name\":\"" + name + "\", \"expired\":" + isExpired() + "}";

    }
}
