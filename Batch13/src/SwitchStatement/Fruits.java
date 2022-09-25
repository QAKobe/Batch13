package SwitchStatement;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite fruit");

        String data = input.nextLine().toLowerCase();
        switch (data){

            case "banana":
                System.out.println("We have " + data + " in the store");

                break;
            case "apple":
                System.out.println("We have " + data + " in the store");
                break;

            case "kiwi":
                System.out.println("We have " + data + " in the store");
                break;

            case "strawberry":
                System.out.println("We have " + data + " in the store");
                break;

            case "mango":
                System.out.println("We have " + data + " in the store");
                break;


            default:
                System.out.println("we dont have it");
        }








    }
}
