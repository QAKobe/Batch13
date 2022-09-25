package IfStatement;

import java.util.Scanner;

public class NestedIfTask1 {
    public static void main(String[] args) {

        System.out.println("What is your city");
        Scanner input = new Scanner(System.in);
        String city = input.nextLine();

        if (city.equalsIgnoreCase("Chicago")){
            System.out.println("Please enter your school");
            String school = input.nextLine();

            if (school.equalsIgnoreCase("Techtorial")){
                System.out.println("You're lucky");
            }else {
                System.out.println("Please visit Techtorial, since you in Chicago");
            }
        }else {
            System.out.println("Please come to Chicago and visit us at Techtorial");
        }
















    }
}
