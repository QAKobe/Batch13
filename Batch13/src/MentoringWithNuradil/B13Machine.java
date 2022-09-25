package MentoringWithNuradil;

import java.util.Scanner;

public class B13Machine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to B13 Store!");
        while (true){
            System.out.println("Would you like to buy something? y/n");
            String answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("We have available products: MacbookPro, MacbookAir, iPhone14");
                System.out.println("Which product would you like to buy?");
                String productName = input.next();
                if (productName.equalsIgnoreCase("MacbookPro")){
                    System.out.println("Price of the MacbookPro - $299");

                } else if (productName.equalsIgnoreCase("MacbookAir")) {
                    System.out.println("Price of MacbookAir -$199");

                } else if (productName.equalsIgnoreCase("iphone14")) {
                    System.out.println("Price for iphone14 -$99");

                }else {
                    System.out.println("Sorry we don't have that item");
                }

            }else {
                System.out.println("Thank you for choosing our store!");
                break;
            }



        }





    }
}
