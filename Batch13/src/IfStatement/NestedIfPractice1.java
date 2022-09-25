package IfStatement;

import com.sun.org.apache.bcel.internal.generic.FALOAD;

public class NestedIfPractice1 {
    public static void main(String[]args){

        // passport, visa ticket

        boolean passport = true, visa = true, ticket = true;

        if (passport == true){
            System.out.println("You have passport, try for visa");

            if (visa == true){

                System.out.println("You have visa go buy a ticket");

                if (ticket == true){
                    System.out.println("Good news! You can travel now");
                }else {
                    System.out.println("You need to buy a ticket first");
                }

            }else {
                System.out.println("You need to get a visa");
            }
        }else {
            System.out.println("You need to get PASSPORT");
        }














    }
}
