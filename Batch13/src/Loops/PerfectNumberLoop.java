package Loops;

import java.util.Scanner;

public class PerfectNumberLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // perfect number
        System.out.println("Please enter a number to check if it is a perfect number");
        int number = input.nextInt();
        int sum = 0;

        for (int divisor = 1; divisor <= number/2; divisor++) {

            if (number % divisor == 0) {

                sum = sum + divisor;

            }

        }
        if (number == sum) {
            System.out.println(number + " is a perfect number");

        }else {
            System.out.println(number+ " is not a perfect number");
        }
    }
}
