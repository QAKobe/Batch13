package StringPackage;

import java.util.Scanner;

public class MethodTask2 {
    public static void main(String[] args) {

        /*
        Get an information of user in the following format: M - David White -1999
        -check if the input string is starting with F
        -check if the input string is ending with M
        -check if input string is equals to your name
        -check if the input string is ending with year 2000
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gender, full name and birth year in the following format >> M - David White -1999");
        String data = input.nextLine();

        System.out.println( data.startsWith("F") );
        System.out.println(data.endsWith("M"));
        System.out.println( data.equals("Kubanych Abdyvasiev") );
        System.out.println(data.endsWith("1999"));

        // replace year

        data = data.replace("1999", "****");
        System.out.println(data);
        String part = data.substring(data.length()-4);
        System.out.println(data.replace(part, "****"));







    }
}
