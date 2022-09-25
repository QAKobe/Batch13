package Objects;

import java.util.Arrays;

public class Task1 {

    public static char[] letterOString(String text) {

        char[] letters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {

            letters[i] = text.charAt(i);

        }
        return letters;
    }

    public static int letterOfString(String[] items){

        return items.length;

    }



    public static void main(String[] args) {

        char[] array1 = letterOString("case");

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(letterOString("phone")));

        //create String array to pass in to method as parameters
        String[] items = {"phone", "case", " batteries", "screen protector"};
        int count = letterOfString(items);
        System.out.println("elements in the given string >>> " + count);



    }




}
