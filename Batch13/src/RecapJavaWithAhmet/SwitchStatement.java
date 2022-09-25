package RecapJavaWithAhmet;

import java.util.Scanner;

public class SwitchStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-It is not likely to have directly switch questions.
    2- In what condition would you use Switch and If/else statements?

    NOTE: Whenever you have limited conditions, go with Switch STATEMENT!
    NOTE: If you have unlimited OR 1 OR 2 conditions then go with IF CONDITION!!!!!

                 IF YOU WANNA LOOK PROFESSIONAL THEN GO EXPLAINING WITH SPECIFIC EXAMPLE WAY.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");
        int options = scanner.nextInt();


        switch (options){
            case 1:
                System.out.println("You're talking to Ahmet");
                break;

            case 2:
                System.out.println("You are talking to Adrian");
                break;

            case 3:
                System.out.println("You are talking to Aizat");
                break;

            case 4:
                System.out.println("You are toalking to Mustafa");
                break;

            default:
                System.out.println("You have no one to talk");

        }




    }
}
