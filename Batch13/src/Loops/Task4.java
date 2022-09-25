package Loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
// PALINDROME
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = input.nextLine();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);// it collects each letter from given string
        }

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is palindrome");

        } else {
            System.out.println(str + " not palindrome");
        }

    }
}
