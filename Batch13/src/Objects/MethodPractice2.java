package Objects;

import java.util.Arrays;

public class MethodPractice2 {

    /*
    create a method that will find sum of numbers from given array
    and return the sum as double
     */

    public double sumFinder(int[] array) {
        double sum = 0;
        for (int number : array) {

            sum = sum + number;
        }

        return sum;
    }
    // create a method that prints following message for your favorite fruits
    // ....apple is healthy
    // {"apple", "banana", "strawberry"}
    // return a String array which should return all the sentences that we will create

    public String[] printMessage(String[] fruits) {
        String[] sentences = new String[fruits.length];
        for (int i = 0; i < fruits.length; i++) {

           // System.out.println(fruits[i].concat(" is healthy"));
            sentences[i] = fruits[i].concat(" is healthy");

        }

        return sentences;
    }


    public static void main(String[] args) {

        MethodPractice2 object1 = new MethodPractice2();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double result1 = object1.sumFinder(numbers);
        System.out.println(result1);

        String[] favoriteFruits = {"apple", "banana", "strawberry"};
        object1.printMessage(favoriteFruits);

       String[] bucket =  object1.printMessage(favoriteFruits);
        System.out.println(Arrays.toString(bucket));




    }
}
