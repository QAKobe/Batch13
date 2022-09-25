package StringPackage;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {

        String day = "Saturday";
        System.out.println( day.split("a"));

        String[] x = {"A", "B", "C"};
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(day.split("a")));

       String[] strArray = day.split("a"); // [S, turd, y]
        System.out.println(Arrays.toString(strArray));

        for (String str: strArray){
            System.out.println(str);
        }

        String apple = "apple is red";

        String[] appleParts = apple.split("a");
        System.out.println(Arrays.toString(appleParts));

        // print every elemenet from appleParts array as uppercase

        System.out.println(Arrays.toString(appleParts).toUpperCase());

        for (String part : appleParts){
            System.out.println(part.toUpperCase());
        }





    }
}
