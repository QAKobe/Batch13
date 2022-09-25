package Loops;

import java.util.Scanner;

public class WhileLoop5 {
    public static void main(String[] args) {


        // multiplication of any given number up to 10
        System.out.println("Please enter an int number");
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = 1;

        while (number2 <= 10){

            System.out.println( number1 + " * " + number2 + " = "  +((number1* number2)));
            number2++;
        }





    }
}
