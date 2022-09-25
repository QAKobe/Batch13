package RecapJavaWithAhmet;

import java.util.Arrays;
import java.util.Locale;

public class StringAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS: ALSO IT IS IMPORTANT FOR AUTOMATION

    1-Most of the technical questions are related with STRING.\
    2-What is the difference between .equals and ==?

        First of all both of them are used for comparison.
            *Whenever you see .equals method, it always compares the Values of the objects*
            *Whenever you see '==' it always compares the Location of the objects.(Be Careful With Two Different Objects)
            NOTE: When you see "NEW" keyword, it means they have different location spot in the HEAP MEMORY

            AUTOMATION:
            1--.trim
            2--.equals
            3--.equalIgnoreCase
            4--.contains
            5--.substring
            6--.toUpper/toLower
            7--.replace

    **String is an object
    How can we declare String object?

    ---String name = "Ahmet"; ---> where do we store this value -- Heap Memory
    ---String name2 = new String("Ahmet"); ---> Heap Memory

    STRING METHODS:
    1-charAt(); --> it gives you the character of the String. It returns char
    2-indexOf(); --> it gives you the index of the character. Returns int
    3-startsWith --> it checks whether the string starts with specific character. Returns boolean
    4-endsWith -->  it checks whether the string ends with specific character. Returns boolean
    5-contains --> it checks whether the string has a specific char or not. It returns boolean
    6-substring --> it is a way to get specific part of the String. Returns String
    7-equals--> it compares the value of the variable. It returns boolean
    8-toLower/toUpper--> it makes the characters to upper or lower case. Returns String.
    9-EqualsIgnoreCase --> it is a way to compare values (2 values) without any sensitiveness (doesn't care about upper or lower case)
    10-split --> it is a way to split the string form specific spot.(" ") **It returns String Array**
    11-length()--> it gives you size(length) of the string. Returns int
    12-concat --> it is a way to connect the String together. Returns String.
    13-replace --> it is a way to replace a specific character/s with new one that you provide. Return String
    14-trim--> Is a great method to remove spaces from beginning and end. ***AUTOMATION PURPOSES***


     */

    public static void main(String[] args) {

        String str = "ahmet loves java";
        String str1 = new String("ahmet loves java");
        String str2 = "ahmet loves java";
        String str3 = new String("ahmet loves java");

        System.out.println(str.equals(str1)); // true --> it checks the value
        System.out.println(str == str1); // false --> it checks the location of the value
        System.out.println(str == str2); // true --> same object and same location
        System.out.println(str1 == str3); // false --> there are 2 different objects. Locations are different
        System.out.println(str1.equals(str3)); // true --> same values

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(str.substring(0,1).toUpperCase()); // the reason we use substring is that you can manipulate
        //the data after you use substring. It is generally compared with charAt, but charAt doesn't have any methods.




    }
}

