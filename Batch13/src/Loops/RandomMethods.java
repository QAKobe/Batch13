package Loops;

import java.util.Random;
import java.util.Scanner;

public class RandomMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String answer;

        do {
            int number = random.nextInt(2);
            System.out.println("Game is started, lets start Make a guess! Head or Tail?");

            String userGuess = input.next();
            String flip = number == 0 ? "Head" : "Tail";

            if (userGuess.equalsIgnoreCase(flip)){
                System.out.println("You are lucky, it is your day!");
            }else {
                System.out.println("Sorry, that was not a correct choice");
            }
            System.out.println("Do you wanna play again? yes/no");
            answer = input.next();
        }while(answer.equalsIgnoreCase("yes") );
        System.out.println("It is ok, see you next time!");







    }
}
