package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Philippines");
        countries.add("Canada");

        System.out.println(countries);


        Object[] countriesArray = countries.toArray(); // from ArrayList to Array

        System.out.println(Arrays.toString(countriesArray));
        countriesArray[0] = "usa";
        System.out.println(Arrays.toString(countriesArray));
      //  countriesArray[4] = "NewCountry";//ArrayIndexOutOfBoundsException. Array size is fixed in regular Array.
      //  System.out.println(Arrays.toString(countriesArray));//ArrayIndexOutOfBoundsException

        ArrayList<Integer> list = new ArrayList<>();











    }
}
