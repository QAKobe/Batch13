package IfStatement;

import java.util.Scanner;

public class ElseIfTask1 {
    public static void main(String[] args) {


        System.out.println("Please enter a number");
        Scanner input = new Scanner(System.in);

        int data = input.nextInt();

        if (data > 0){
            System.out.println("Your number is positive");
        } else if (data < 0) {
            System.out.println("Your number is negative number");
        }else {
            System.out.println("Your number is ZERO");
        }






    }
}
