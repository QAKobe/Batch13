package IfStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {

        String option = "unknown";
        String day = "monday";
        if (option.equalsIgnoreCase("weekday")){

            if (day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")){
                System.out.println("Efe is available");

            }else {
                System.out.println("He is unavailable");
            }

        }else {
            System.out.println("This is weekend and your instructor will be Yusuf");

        }













    }
}
