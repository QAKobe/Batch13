package IfStatement;

import java.util.Scanner;

public class NestedIfTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome! Do you know java? yes/no");
        String java = input.next();

        if (java.equalsIgnoreCase("yes")){

            System.out.println("Do you know Selenium? yes/no");
            String selenium = input.next();

            if (selenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API testing? yes/no");

                String api = input.next();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you know SQL? yes/no");
                    String sql = input.next();
                    if(sql.equalsIgnoreCase("yes")){
                        System.out.println("Congratulations! You are hired");

                    }else {
                        System.out.println("We need SQL skills");
                    }


                }else {
                    System.out.println("We need API skills");
                }


            }else {
                System.out.println("We need someone who knows Selenium");
            }




        }else {
            System.out.println("Please learn java and try again");

        }





    }
}
