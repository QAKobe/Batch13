package IfStatement;

import java.util.Scanner;

public class ElseTask3 {
    public static void main(String[] args) {

        /*
        ask user zipcode as int
        check if zipcode is even number
        -print >> you live in on even number zipcode
        -otherwise print -->> you live in on odd zipcode
         */

        System.out.println("Please enter your zipcode to see whether you live in an even number or odd");
        Scanner input = new Scanner(System.in);
        int zipcode = input.nextInt();
        if (zipcode % 2 == 0){

            System.out.println("you live in on even number zipcode: " + zipcode);
        }else {

            System.out.println("you live in an odd number: " + zipcode);
        }










    }
}
