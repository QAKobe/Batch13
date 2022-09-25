package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /*
        {"Monday", "Tuesday", "Wednesday"}
         */

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] reverse = new String[weekDays.length];// we stored data into new array
        int index = 0;
        for (String day : weekDays) {
            String reversed = "";
            for (int k = day.length() - 1; k >= 0; k--) {

                reversed = reversed + day.charAt(k);

            }
            System.out.println(reversed);
            reverse[index] = reversed;
            index++;


        }

        System.out.println(Arrays.toString(reverse));
        Scanner scanner = new Scanner(System.in);



//        int sizeOfArray = scanner.nextInt();
//        String[] names = new String[sizeOfArray];




        for (String newWord : reverse) {
            String forward = "";
            for (int w = newWord.length()-1; w >= 0; w--) {

                forward = forward + newWord.charAt(w);

            }
            System.out.println(forward);

        }




    }
}
