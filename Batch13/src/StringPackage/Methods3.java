package StringPackage;

import java.security.acl.NotOwnerException;
import java.util.Locale;

public class Methods3 {
    public static void main(String[] args) {

        String text = "Do whatever IT takes to be successful";
        // toLowerCase(), toUpperCase(); returns string
        text = text.toLowerCase();
        System.out.println(text);

        text = text.toUpperCase();
        System.out.println(text);
        System.out.println(text.toLowerCase());

        // startsWith(); endWith(); returns true/false

        boolean r1 = text.startsWith("d");
        System.out.println(r1);

        boolean r2 = text.startsWith("DO");
        System.out.println(r2);

        boolean r3 = text.startsWith("TAKES");
        System.out.println(r3);

        boolean r4 = text.endsWith("UL");
        System.out.println(r4);
        System.out.println(text.endsWith("DO WHATEVER IT TAKES TO BE SUCCESSFUL"));

        // equals(), equalsIgnoreCase(); returns boolean true/false

        String str1 = "Red";
        String str2 = "RED";

        boolean areSame1 = str1.equals("red");
        System.out.println(areSame1);

        System.out.println(str1.equals("ed"));
        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str2.toLowerCase()));
        System.out.println(str1.toUpperCase() == str2);
        System.out.println("===========================");

        //equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase("ReD"));
        System.out.println(str1.equalsIgnoreCase("White"));

        str1 = str1.toUpperCase();
        System.out.println(str1.equals(str2));//true

        String language = "java";

        //replace(); char by char or string by string
        String  newLanguage = language.replace('v', 'x');
        System.out.println(newLanguage);

        System.out.println(newLanguage.replace('x', 'v'));
        System.out.println(newLanguage);
        System.out.println("-----------------------------");
        System.out.println(language.replace('y', '*'));

        System.out.println(language.replace('a', '$'));//all 'a replaced with $ sign

        //replace string by string
        language = language.replace("va", "da");
        System.out.println(language);

        System.out.println(language.replace("da", "YES"));
        System.out.println(language.replace("jada", "English"));

        System.out.println(language.replace("d", " I like this replacement** "));

        language = language.replace("d", "v");
        System.out.println(language);










    }
}
