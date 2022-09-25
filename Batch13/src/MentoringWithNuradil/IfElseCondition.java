package MentoringWithNuradil;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter another string");
        int num1 = input.nextByte();
        int num2 = input.nextByte();

        if (num1>num2){
            System.out.println(num1+ " is bigger");

        } else if (num1==num2) {
            System.out.println("They are equal");

        } else {
            System.out.println(num2+ " is bigger");
        }





    }
}
