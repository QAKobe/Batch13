package Loops;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {

        // task to find whether any number can be divided evenly

        System.out.println("Please enter a positive integer");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int divisor = 1;

        while (divisor <= number){

            if (number % divisor == 0){
                System.out.println(divisor + " can divide " + number + " evenly");

            }else {
                System.out.println(divisor + " not ");
            }
            divisor++;

        }
        System.out.println("======================");


    }
}
