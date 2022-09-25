package IfStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {

        // pick a number between 0 and 15
        // if the number is between 0 and 5 --> print your number is in the range of 0-5
        // if the number is btw 5 to 10 --> your number is in the range of 6-10
        // if the number is btw 10 and 15 --> your number is in the range of 10 - 15

        int number = 15;

        if (number >= 0 && number <=5){

            System.out.println("Your number is in the range of 0 - 5");
        } else if (number >= 6 && number <= 10) {
            System.out.println("your number is in the range of 6-10");
        } else if (number >= 11 && number < 16) {
            System.out.println("your number is in the range of 11 - 15");
        }else {
            System.out.println("Your number is out of range");
        }









    }
}
