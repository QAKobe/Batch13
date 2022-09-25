package IfStatement;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {

        /*
        ask user if he/she has driver license
        -print you are great
        -otherwise print - please visit DMV
         */

        System.out.println("Do you have a driver's license yes/no?");

        Scanner question = new Scanner(System.in);
        String answer = question.nextLine();
        if (answer.equalsIgnoreCase("yes")){

            System.out.println("You are great");
        }else {

            System.out.println("Please visit DMV");
        }







    }
}
