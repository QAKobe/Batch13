package ArrayList;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Computer {

    //create computer class with following instance fields
    //override -- > toString method to show Computer features
    //create a test class: create an arrayList and store 4 computers
    //create a method in this test class to find out computer with a price of less than 500$ and show it
    //create a method that will take an ArrayList as parameter and this method should calculate sum of all computer prices
    //return device price in a separate list

    String brand;
    String model;
    int sizeOfScreen;
    double price;

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", sizeOfScreen=" + sizeOfScreen +
                ", price=" + price +
                '}';
    }

    public Computer(String brand, String model, int sizeOfScreen, double price) {
        this.brand = brand;
        this.model = model;
        this.sizeOfScreen = sizeOfScreen;
        this.price = price;
    }

    public static void calculation(ArrayList<Computer> laptops){

      for (Computer machine:laptops){

          if (machine.price < 500){
              System.out.println("Price of this " + machine.brand + " is less than $500");
          }

      }


    }
    public static void findSum(ArrayList<Computer>laps){
        double sum = 0;
        for (Computer item : laps){
            sum = sum + item.price;
        }
        System.out.println("Total price of Computers is: " + sum);

    }

    public static ArrayList<Double>sumOfPrice(ArrayList<Computer>comps){
        double total = 0;
        ArrayList<Double> prices = new ArrayList<>();
        for (Computer dd : comps){
            prices.add(dd.price);
            total = total + dd.price;
        }
        System.out.println("Total price of Computers is: " + total);
        return prices;
    }










}
