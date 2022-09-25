package IfStatement;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7 as an integer");

        int number1 = input.nextInt();

        if(number1 == 1){
            System.out.println(" This is Monday");
        }

        if(number1 == 2){
            System.out.println("This is Tuesday");
        }

        if(number1 == 3){
            System.out.println("This is Wednesday");
        }

        if(number1 == 4){
            System.out.println("This is Thursday");
        }

        if(number1 == 5){
            System.out.println("This is Friday");
        }

        if(number1 == 6){
            System.out.println("This is Saturday");
        }

        if(number1 == 7){
            System.out.println("This is Sunday");
        }

        // 'There is no Day for that entry'...21
        // ...-1, 0, 1, 2,...6, 7, 8,.......

        if (number1 <1 || number1>7){
            System.out.println("There is no day for that entry>>" + number1);
        }











    }
}
