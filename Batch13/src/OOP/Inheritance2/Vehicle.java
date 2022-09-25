package OOP.Inheritance2;

import Inheritance1.Flower;

public class Vehicle {

    protected String model;
    public String brand;
    int year;

    public Vehicle(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void moving(){

        System.out.println("The vehicle is moving");

    }

    boolean stop(){
        System.out.println("The vehicle is stopped");
        return true;
    }

    protected boolean start(){

        System.out.println("The vehicle is starting");
         return true;
    }

    Object accelerate(){
        System.out.println("The vehicle is accelerating");
         return new Object();

    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
