package ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class Car {
    /*
    create a car class with instance variables of: brand, model, color, year.
    initialize all instance variables.
    in a test class store 3 car objects in a list. create a method to find out blue cars and print that car's brand and model
     */
    String brand;
    String model;
    String color;
    double year;

    public Car(String brand, String model, String color, double year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public static void machine(ArrayList<Car>engine){
        for (Car name: engine){
           if (name.color.equalsIgnoreCase("Blue")){
               System.out.println(name.brand + ""+name.color);
           }
        }

    }




}
