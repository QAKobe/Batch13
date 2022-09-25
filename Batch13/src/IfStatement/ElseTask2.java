package IfStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {

        /*
        when your purchase is over 100 you will get 20% discount
        otherwise you will get only 5% discount

        -calculate discount for each case
        -calculate final amount of payment and show
         */


        System.out.println("if you purchase is over 100 you will get 20% discount if not you will get 5% discount");
        Scanner purchase = new Scanner(System.in);
        double expense = purchase.nextDouble();
        if (expense > 100){
            System.out.println("Your discount is " + "$"+ (expense * 0.20));
            System.out.println(expense * 0.80);

        }else {
            System.out.println("Your discount is " + "$" + (expense * 0.05));
            System.out.println(expense * .95);

        }

        }








    }

