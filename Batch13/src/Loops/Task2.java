package Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive number less than 100");
        int userNumber = input.nextInt();
        int number = 1;

        while (userNumber >= number){

            if (number % 5 == 0){
                System.out.println(number);
            }

            number++;

        }








    }



}
