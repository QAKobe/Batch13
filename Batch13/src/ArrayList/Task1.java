package ArrayList;

import java.util.ArrayList;

public class Task1 {

    // create a method that will take an ArrayList as a parameter
    // this method will show only drinks which has length of more than 3 letters
    // assume that you have list of drinks to test.
    // create main method to test your code by calling the method
    // imagine you drink like this "Coffee, Tea, Water"



    public static void printDrink(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++){

            if (list.get(i).length() > 3){
                System.out.println("This drink has more than 3 letters:" + list.get(i));

            }

        }

    }

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Coke");
        drinks.add("Milk");
        drinks.add("Orange Juice");
        drinks.add("Tea");
        printDrink(drinks);







    }


}
