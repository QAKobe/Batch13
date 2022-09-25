package Objects;

import java.util.Arrays;

public class Clock {


    // THESE ARE FEATURES OF THE OBJECTS
    int countOfNumbers;
    String shape;
    boolean sound;

    String price;

    public String toString(){

        return countOfNumbers + ", "+ shape +", "+sound;
    }

    // create a method which defined by using var args as parameters
    // this method will find out average miles that a person runs in a week(7)
    // 5,7,10,2,0,0,5

    public static void averageMiles(int ... mile){

        int sum = 0, average;
        for (int number : mile) {
            sum = sum + number;

        }
        average = sum/ mile.length;
        System.out.println(average);

    }


    public static void main(String[] args) {

        Clock clock = new Clock();

// now we need to override to toString method in this class to see the properties of any clock object
        System.out.println(clock);

        Clock clock1 = new Clock();

        clock1.shape = "Circle";
        System.out.println(clock1);

        averageMiles(4,5,6,7,8,9,0);

        averageMiles(10,11,4,5,6,7,8,6,5);







    }












}
