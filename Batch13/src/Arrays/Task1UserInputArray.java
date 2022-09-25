package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1UserInputArray {
    public static void main(String[] args) {
        /*
        ask user how many names they want to store in an array
        name 1 name 2 till 25
        take every name from user and store it in names array
        print all the names by using .toString();
        print all the names by using loop
        adjust this code by sorting the names with 5 letters or more goes to longNames array the rest goes to shortNames array
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to store? Please enter ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[numberOfNames];
        String[] longNames = new String[numberOfNames];
        String[] shortNames = new String[numberOfNames];


        for (int i = 0; i < numberOfNames; i++){
            System.out.println("Please enter " + (i +1) + ".name");
           // names[i] = scanner.nextLine();
            String name = scanner.nextLine();
            names[i] = name;
            if(name.length() >= 5){
                longNames[i] = name;
            }else {
                shortNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));
        System.out.println(Arrays.toString(names));

//        for (int i = 0; i < names.length; i++){
//            System.out.println(names[i]);
//        }
//        System.out.println(longNames+ "--" + shortNames );

















    }
}
