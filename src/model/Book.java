package model;

public class Book  {
    private String title;

    public Book(String title){
        this.title = title;
    }

    public String toString(){
        return "Book: " + title;
    }

    public String toJson(){
        return "{\"type\":\"Book\", \"title\":\"" + title + "\"}";
    }
}
