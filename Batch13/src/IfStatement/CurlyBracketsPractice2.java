package IfStatement;

public class CurlyBracketsPractice2 {
    public static void main(String[] args) {

        double money = 100;

        double itemPrice = 200;

        if (money < itemPrice)
            System.out.println("You cannot buy this item");
        System.out.println("It is a sunny day");


        String color = "White";

        if (color.length()<3)
            System.out.println("This color has less than 10 letters");
        System.out.println("Is it break time yet?");

        System.out.println("************************************");

        // decrement/Increment

        int a = 5, b =3, x;

        a++;// this is a statement

        if (a < b + b)//false = 6 < 3+3 == 6<6 is FALSE
            b++;
         x = a + ++b;//6 + ++4 = 10

        if (x > 20)
            System.out.println(x);// This statement will be skipped because if condition is false

        --x;//9
        System.out.println(x);
        System.out.println("==============================");

//====================================================================

        if (a < b + b) {//false = 6 < 3+3 == 6<6 is FALSE
            b++;
            x = a + ++b;//6 + ++4 = 10
        }

        if (x > 20) {
            System.out.println(x);// This statement will be skipped because if condition is false

            --x;//9
            System.out.println(x);
        }
















    }
}
