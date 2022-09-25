package RecapJavaWithAhmet;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    /*
    POSSIBLE INTERVIEW QUESTIONS: Once you start any explanation go with GENERAL to DEEP

    1-What is wrapper class?
        Wrapper Class--> It is a process to convert data into different forms
        -->Primitive --> Object
        -->Object --> Primitive

    2-How many of wrapper class do you know? // Can you tell me about AutoBoxing and Unboxing?
        AutoBoxing: --> Primitive to Object  --> It is a way to convert from Primitive to Object
        Unboxing: --> Object to Primitive --> It is a way to convert from Object to Primitive

    3-Where do you use Wrapper Class in your project?

    I use it in my Collections. That's it!

     */
    public static void main(String[] args) {

        //Collections store only Objects!
        List<Integer> numbers = new ArrayList<>();

        //This is an example of autoboxing, and it doesn't require extra methods or energy for conversion
        int age = 30; // primitive data
        numbers.add(age); // PRIMITIVE TO OBJECT! (Once it stores in the list then it has object methods)
        System.out.println(numbers);

        // This is an example of Unboxing, and it requires extra methods or energy for conversion(parsing)
        String nmbr = "12";
        int number = Integer.parseInt(nmbr); // Unboxing process
        System.out.println(number);

        double num = Double.parseDouble(nmbr);
        System.out.println(num);


        //String Value of: --> is not a wrapper class. It seems it is autoboxing but it is not********
        // Whenever you need to manipulate the data you should use String Value of!!!
        int numberOfStudentsId = 1230;
        String id = String.valueOf(numberOfStudentsId); // this is more professional way
        String id2 = numberOfStudentsId + ""; // not a professional way to do it.
        System.out.println(id);
        System.out.println(id2);


    }
}
