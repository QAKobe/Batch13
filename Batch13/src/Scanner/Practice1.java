package Scanner;

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        String text = new String();

        text = "Java";
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        String myName = "sam";
        System.out.println("Please enter your name: " );
        myName = scanner.nextLine();

        System.out.println("Hello " +myName);

        System.out.println("Enter you last name : ");
        String lastName = scanner.nextLine();

        System.out.println("Your full name is " + lastName + " " + myName);

        System.out.println("Please enter your zipcode as an integer: ");

        int zipcode = scanner.nextInt();

        System.out.println("Hey " + myName +"," + " you live in this " + zipcode + " zipcode" );

        System.out.println("please enter your address ");
        scanner = new Scanner(System.in);// Recreated the scanner again if we used Int before
        String address = scanner.nextLine();
        System.out.println("you address is " +address);

        System.out.println("Please enter your phone number: ");

        long phoneNumber = scanner.nextLong();
        System.out.println("Is this phone number correct? " + phoneNumber);

        String yesNo = scanner.next();
        System.out.println("You said " + yesNo);


    }
}
