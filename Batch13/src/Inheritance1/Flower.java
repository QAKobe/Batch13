package Inheritance1;

public class Flower {

    String color;
    String type;
    String size;
    double price;

    // create a constructor to initialize instance variables


    public Flower(String color, String type, String size, double price) {
        this.color = color;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public Flower(String size, double price) {
        this.size = size;
        this.price = price;
    }

     public Flower() {
    }
}
