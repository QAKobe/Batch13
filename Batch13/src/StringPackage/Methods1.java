package StringPackage;

public class Methods1 {
    public static void main(String[] args) {

        String name = "David";
        // length(); it will return number of letter from string as an integer
        System.out.println(name);
        int length = name.length();
        System.out.println(length);
        System.out.println(name.length());

        name = name + " White";// the name is now David White
        System.out.println(name.length());

        //concat(); it will add given string value to the string

        name = name.concat(" is not here");
        System.out.println(name);

        int b = name.length();
        System.out.println("the length of the new string is " + b);

        //charAt(); -->> it will take an index number and returns the char at given index

        char letter = name.charAt(0);// at index 0 on the "name" -- D
        System.out.println(letter);// prints -->> D

        name = "Selenium";

        char letter2 = name.charAt(2);// returns "L"
        System.out.println(letter2);

        char letter3 = name.charAt(5);
        System.out.println(letter3);

        String str = "I will do it anyway tomorrow!";

        int lengthOfStr = str.length();
        System.out.println(lengthOfStr);

        char action = str.charAt(lengthOfStr - 1);
        System.out.println(action);

        System.out.println(str.charAt(str.length()-1));




    }
}
