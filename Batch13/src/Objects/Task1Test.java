package Objects;

import java.util.Arrays;

public class Task1Test {
    public static void main(String[] args) {

        char[] array1 = Task1.letterOString("case");

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(Task1.letterOString("phone")));

        //create String array to pass in to method as parameters
        String[] items = {"phone", "case", " batteries", "screen protector"};
        int count = Task1.letterOfString(items);
        System.out.println("elements in the given string >>> " + count);





    }
}
