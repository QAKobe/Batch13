package Primitives;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RemainderPractice {

    public static void main(String[] args) {
        // TASK
        int number = 222;
        int temp = number;
        int digit1 = number % 10;


        number = number / 10;

        int digit2 = number % 10;

        number = number / 10;


        int digit3 = number % 10;


        System.out.println("The sum of : " + temp + " is " + (digit1* digit2* digit3));

        //NEW TASK

        int myNum = 222;
        int originalNum = myNum;

        int d1, d2, d3;

        d1 = myNum % 10;//taking the last digit//5
        myNum = myNum / 10;// updating the number//34

        d2 = myNum % 10;//taking the second digit//4
        myNum = myNum / 10;// updating the number//3

        d3 = myNum % 10;// taking the third digit//3
        myNum = myNum / 10;// updating the number//0

        System.out.println("The product of digits of " + originalNum + " is " +  (d1+ d2+ d3));
        System.out.println(d3);
        System.out.println(d2);
        System.out.println(d1);

        int numbers = 5687, totalNumbers = numbers, q1, q2, q3, q4;

        q1 = numbers % 10;
        numbers = numbers / 10;

        q2 = numbers % 10;
        numbers = numbers / 10;

        q3 = numbers % 10;
        numbers = numbers / 10;

        q4 = numbers % 10;
        numbers = numbers / 10;

        System.out.println("The list of " + totalNumbers + " as follows ");
        System.out.println(q4);
        System.out.println(q3);
        System.out.println(q2);
        System.out.println(q1);

    }
}
