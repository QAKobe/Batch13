package Task5;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how much you would like to convert: ");

        double num = scan.nextDouble();

        double num2 = 85;

        double total = num * num2;

        System.out.println("Converted value is : " + (total));






    }
}
