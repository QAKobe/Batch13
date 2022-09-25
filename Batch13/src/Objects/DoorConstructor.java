package Objects;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class DoorConstructor {

    String color;
    String shape;
    int size;


    public static void open(int inches){
        System.out.println("**********" + inches);
    }
    // behavior of the door?(meaning a method)
    public static void open() {
        System.out.println("Door is opening");
    }

    // constructor for this door
    public DoorConstructor() {

        System.out.println("NO argument CONSTRUCTOR");
    }

    public DoorConstructor(String color){

        this.color = color;
        System.out.println("ONE argument(color) CONSTRUCTOR");
    }

    //Another Constructor
    public DoorConstructor(String shape, String color, int size){

        this.shape = shape;
        this.color = color;
        this.size = size;
        System.out.println("Two argument CONSTRUCTOR");

    }



    public static void main(String[] args) {

        open();
        open(10);

        DoorConstructor door1 = new DoorConstructor();

        DoorConstructor door2 = new DoorConstructor("White");

        door1.color = "Brown";
        door1.shape = "Rectangle";

        System.out.println(door1.color);

        DoorConstructor door3 = new DoorConstructor("Gray");

        DoorConstructor door4 = new DoorConstructor("Triangle", "Black", 44);

        System.out.println(door4.color);

        DoorConstructor door5 = new DoorConstructor("Circle", "Red", 100);

        System.out.println(door5.size);
        System.out.println(door5);

        DoorConstructor door6 = new DoorConstructor("Brown");



    }


}
