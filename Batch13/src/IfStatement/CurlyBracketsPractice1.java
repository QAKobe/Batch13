package IfStatement;

public class CurlyBracketsPractice1 {
    public static void main(String[] args) {

        int number = 123;
        // Without curly brackets, if statement will execute all following codes
        if (number == 123)
            System.out.println("First Statement");
        System.out.println("Second statement");
        System.out.println(56 - 10);

        // Without curly brackets, if statement will skip the first piece of code when boolean condition is FALSE
        //
        System.out.println("---------------------------");
        if (number > 500)
            System.out.println("Hi this is FIRST STATEMENT");
        System.out.println("Hello, this is SECOND STATEMENT");
        System.out.println("I am learning if block");


        if (8 != 8) {

            System.out.println("8 should be equal to 8");
        }


    }
}
