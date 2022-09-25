package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String[] countries = {"USA", "Mexico", "Canada"};

        List<String> countriesList = Arrays.asList(countries);

        System.out.println(countriesList);

      //  countriesList.add("New Country");// UnsupportedOperationException ---> since it was created from array to arraylist it is holding up its origin size
       // System.out.println(countriesList);// UnsupportedOperationException

        //countriesList.remove("Canada"); same here can't delete or add to fixed size of the array and arrayList
        //System.out.println(countriesList);
        countriesList.set(0, "usa");
        System.out.println(countriesList);

        List items = Arrays.asList(1,2,3,4,5,6);

        System.out.println(items);

        List items2 = Arrays.asList("Bee", "Butterfly", "Spider", "Fly", "Mosquito");
        System.out.println(items2);

      //  items2.add("ant");
      //  System.out.println(items2);









    }
}
