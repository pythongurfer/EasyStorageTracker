package model;

public class Device {
    private String model;

    public Device(String model){
        this.model = model;
    }

    public String toString(){
        return "Device: " + model;
    }

    public String toJson(){
        return "{\"type\":\"Device\", \"model\":\"" + model + "\"}";
    }
}
