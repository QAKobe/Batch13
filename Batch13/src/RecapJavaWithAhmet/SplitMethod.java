package RecapJavaWithAhmet;

import java.util.Arrays;

public class SplitMethod {
    /*
    POSSIBLE INTERVIEW TASK:

    String str = "Hello java is so cool";
    1-to revers all words each one by one

     */

    public static void main(String[] args) {

        String str = "Hello java is so cool";

        String [] str2 = str.split(" ");

        System.out.println(Arrays.toString(str2));

        for (int i = 0; i < str2.length; i++){ // length is 5
            String reversed = ""; // we need to empty the reversed that's why it is inside the loop.
            // If it was outside it would add up all the strings on top each other
            for (int k = str2[i].length()-1; k >= 0; k--){

                reversed += str2[i].charAt(k);
            }
            System.out.println(reversed);
        }

        // reversing String[] using for each loop
//        for (String words:str2){
//
//            StringBuffer stringBuffer = new StringBuffer(words).reverse();
//            System.out.println(stringBuffer);
//        }











    }
}
