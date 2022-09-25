package StringPackage;

import java.util.Scanner;

public class MethodsTask1 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any string");
        String text = scanner.nextLine();
        //hello
        System.out.println("The first char from " + text + " is " + (text.charAt(0)));
        System.out.println("The last char from " + text + " is " + (text.charAt(text.length()-1)));
        System.out.println("The length of the string is " + text.length());
        System.out.println("The index of middle letter is " + text.indexOf(text.charAt(text.length()/2)));
        System.out.println("The middle char is " +(text.charAt(text.length()/2) ));
        System.out.println("The index of second matching t " + text.indexOf('t', text.indexOf('t')+1));









    }
}
