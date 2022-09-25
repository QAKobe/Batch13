package IfStatement;

import java.util.Scanner;

public class ElseIfTask2 {

    public static void main (String[]args){

        /*
        take 3 test scores between 0 -100
        see if average of 3 tests and give grades
        average is 100 -90 is A
        average is 89 -80 is B
        average is 79 -70 is C
        average is 69 -60 is D
         */

        System.out.println("Please enter your test scores three time to see your average");
        Scanner input = new Scanner(System.in);
        int test1 = input.nextInt();
        int test2 = input.nextInt();
        int test3 = input.nextInt();

        int average = (test1 + test2 + test3)/3;

        if (average <= 100 && average >= 90){
            System.out.println("You letter grade is A");
        } else if (average <= 89 && average >= 80) {
            System.out.println("You letter grade B");

        } else if (average <= 79 && average >=70 ) {
            System.out.println("Your letter grade is C");

        } else if (average >100 || average < 0) {
            System.out.println("Your grade is out of range");

        } else if (average <= 69 && average >= 60) {
            System.out.println("Your letter grade is D");

        }else{
            System.out.println("We have space for next semester");
        }


    }
}
