package ArrayList;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

        // syntax of arrayList
        ArrayList list = new ArrayList();
        ArrayList<String> shoppingList = new ArrayList();

        // add() --> adding element to the arrayList
        shoppingList.add("shoe");
        shoppingList.add("Hat");
        shoppingList.add("cup");
        shoppingList.add("glasses");

        boolean b = true;
        shoppingList.add(Boolean.toString(b));
        System.out.println(shoppingList);

        shoppingList.add(2,"Milk");
        System.out.println(shoppingList);

        System.out.println(shoppingList); // result is in insertion order

        //get() --> is returning element from given index
        System.out.println(shoppingList.get(0)); // shoe pops up in the console

        String item1 = shoppingList.get(1);
        System.out.println(item1);

        // size(); --> returns number count of elements from arrayList

        System.out.println(shoppingList.size());
        Integer count = shoppingList.size();
        int count1 = shoppingList.size();

        // print out very last element from the shopping list
            System.out.println(shoppingList.get(shoppingList.size()-1));

            for (int i = 0; i < shoppingList.size()-1; i++){

                System.out.println(shoppingList.get(i));

            }

        System.out.println(shoppingList.get(shoppingList.size()-1));

        System.out.println(shoppingList);

        String x = "love";
        String y = "Hate";

        x = x + y;

        System.out.println(x);

        y = x.substring(0, (x.length() - y.length()));

        x = x.substring(y.length());

        System.out.println("This is after " + x + " " + y);


    }
}
