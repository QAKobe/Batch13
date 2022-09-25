package Loops;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {


        // enter two numbers and find the numbers in between
        System.out.println("Please enter two positive numbers");
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number1 <= number2) {
            while (number1 <= number2) {
                System.out.println(number1++);

            }

        }else {
            while (number2 <= number1){
                System.out.println(number2++);
            }
        }



    }
}
