package Loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number");

        int firstN = input.nextInt();
        System.out.println("Please enter second number");
        int secondN = input.nextInt();
        int sum = 0;

        do {

            sum = sum + firstN;
            System.out.println("The sum of numbers between " + firstN + " and " + secondN + " is " + sum);

            firstN++;

        }while (firstN <= secondN);
        System.out.println(sum);











    }
}
