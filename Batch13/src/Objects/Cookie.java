package Objects;

import java.util.ArrayList;
import java.util.List;

public class Cookie {
    /*

     */

    double price;
    String flavor;
    int size;
    String shape;

    /*
    *Way of initializing instance variables
    * -create object and initialize by using object
    * -create a method and initialize by using method
    * -when you create initialize it
     */

    public void initialize(double price1, String flavor1, int size1, String shape1){

        price = price1;
        flavor = flavor1;
        size = size1;
        shape = shape1;



    }
    public String toString(){

        return price + ", " + flavor + ", " + size + ", " + shape;

    }

    public static void main(String[] args) {

        Cookie c1 = new Cookie();
        c1.initialize(.99, "vanilla", 1, "triangle ");

        Cookie c2 = new Cookie();
        Cookie c3 = new Cookie();
        Cookie c4 = new Cookie();
        Cookie c5 = new Cookie();



        System.out.println(c1);
        c2.initialize(5.9, "chocolate", 6, "square");
        System.out.println(c2);

        c3.size = 3;
        System.out.println(c3);

        List<Cookie> allCookies = new ArrayList<>();

        allCookies.add(c1);
        allCookies.add(c2);

        for (Cookie name : allCookies){
            System.out.println(name);
        }



    }



}
