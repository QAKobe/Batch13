package Loops;

import java.util.Scanner;

public class DoWile3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        String star = "*";

        do {


            System.out.println(star);// *, **, ***, ****, *****
            star +="*";// **, ***, ****, *****
            number--;

        }while (number >= 0);








    }
}
