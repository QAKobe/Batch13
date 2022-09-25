package IfStatement;

import java.util.Scanner;

public class IfPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name of the day");
        String day = input.nextLine();

        if(day.equalsIgnoreCase("monday")){
            System.out.println("It is day 1");
        }

        if(day.equalsIgnoreCase("TUESDAY")){
            System.out.println("It is day 2");
        }

        if(day.equalsIgnoreCase("WEdnesday")){
            System.out.println("It is day 3");
        }

        if(day.equalsIgnoreCase("thursday")){
            System.out.println("It is day 4");
        }

        if(day.equalsIgnoreCase("Friday")){
            System.out.println("It is day 5");
        }

        if(day.equalsIgnoreCase("Saturday")){
            System.out.println("It is day 6");
        }

        if (day.equalsIgnoreCase("Sunday")){

            System.out.println("It is day 7");
        }

        if (!day.equalsIgnoreCase("monday")||!day.equalsIgnoreCase("tuesday")||!day.equalsIgnoreCase("wednesday")||!day.equalsIgnoreCase("thursday")
        ||!day.equalsIgnoreCase("friday")||!day.equalsIgnoreCase("saturday")||!day.equalsIgnoreCase("sunday")){
            System.out.println("Your entry does not match our records");

        }

        if (day.startsWith("M")||day.startsWith("m")){

            System.out.println( " String solution 'It is Monday' --->>> startsWith solution ");
        }

       char fl = day.charAt(0);
        if (fl == 'm' || fl == 'M'){

            System.out.println(" Char solution 'it is Monday' ");
        }

        if (fl == 'T' || fl == 't'){

            System.out.println("It is either Tuesday or Thursday using Char solution");
        }

        if (fl == 'W' || fl == 'w'){
            System.out.println("Thi is Wednesday using char");
        }

        //complete the rest for other days --> Friday, Saturday, Sunday




















    }
}
