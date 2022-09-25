package SwitchStatement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please choose from following departments: \n 1 - IT \n 2 - HR \n 3 - Admin");
       int departments = input.nextInt();

        switch (departments){

            case 1:
                System.out.println("Who do you want to speak from IT department? \nAlex \nZack, \nDiana");

                String name = input.next().toUpperCase();
                switch (name){

                    case "ALEX":
                        System.out.println("You're connected to Alex");
                        break;

                    case "ZACK":
                        System.out.println("You're connected to Zack");
                        break;

                    case "DIANA":
                        System.out.println("You're connected to Diana");
                        break;

                    default:
                        System.out.println("There is no " + name + " in IT department");
                        break;
                }break;

            case 2:
                System.out.println("Who do you want to speak from HR department? \nTima \nAna");
                String name2 = input.next().toLowerCase();

                switch (name2){

                    case "tima":
                        System.out.println("You're connected to Tima");
                        break;

                    case "ana":
                        System.out.println("You're connected to Ana");
                        break;

                    default:
                        System.out.println("There is no " + name2 + " in HR");
                        break;

                }break;

            case 3:
                System.out.println("Who do you want to speak from Admin department? \nTima \nAna");
                String name3 = input.next().toLowerCase();

                switch (name3){

                    case "david":
                        System.out.println("You're connected to David");
                        break;

                    case "tima":
                        System.out.println("You're connected to Tima");
                        break;

                    default:
                        System.out.println("There is no " + name3 + " in Admin");
                        break;

                }break;

            default:
                System.out.println("No matching department for your entry, you're connecting to John");
                break;





        }












    }

}
