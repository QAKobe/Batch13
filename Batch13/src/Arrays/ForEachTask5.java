package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachTask5 {
    public static void main(String[] args) {

        /*
        String names and create an email for each names
        for example david@techtorial.com
        and then store these new emails into an array
        print out all the emails
         */

       String[] names = {"David", "John", "Diana", "Mustafa", "Kuba", "Gulistan"};
       String[] emails = new String[names.length];
       int i = 0;

       for (String emailNames : names){
           System.out.println(emailNames.toLowerCase().concat("@techtorial.com"));
           emails[i] = emailNames.toLowerCase().concat("@techtorial.com");
           i++;
       }
       //find an email for mustafa
        System.out.println(Arrays.toString(emails));
       for (String email : emails){
           if (email.contains("kuba")){
               System.out.println(email);
           }
       }

    }
}
