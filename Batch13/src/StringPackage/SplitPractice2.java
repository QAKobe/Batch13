package StringPackage;

import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {

        String str = "I want to solve this question in two minutes";

        // separate word by word



     String[] separate =  str.split(" "); // split the str from space, print as whole String Array
     System.out.println(Arrays.toString(separate));// Print as  whole array
        System.out.println("------------------------------");

        for (int i = 0; i < separate.length; i++){//traditional for loop
            System.out.println(separate[i]);

        }
        System.out.println("-------------------------------");

     for (String words : separate){ // for each loop one by one
         System.out.println(words);
     }










    }
}
