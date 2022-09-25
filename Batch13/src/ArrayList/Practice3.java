package ArrayList;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Los Angeles");
        cities.add("Denver");
        cities.add("San Francisco");

        System.out.println(cities);

        // Remove

        cities.remove("Denver");
        System.out.println(cities);
        cities.add(2, "Denver");
        System.out.println(cities);

        cities.remove(1);
        System.out.println(cities);

        //set();
        cities.set(1, "Bishkek");
        System.out.println(cities);
        cities.add(2, "Denver");
        System.out.println(cities);
        cities.add(2, "Los Angeles");
        System.out.println(cities);

        // isEmpty()
        System.out.println(cities.isEmpty());

        //clear(); --> removes all elements form ArrayList
        cities.clear();
        System.out.println(cities.isEmpty());


        cities.add("Chicago");
        cities.add("Los Angeles");
        cities.add("Denver");
        cities.add("San Francisco");


        System.out.println(cities.indexOf("Denver"));

        Boolean b2 = cities.contains("Bishkek");
        System.out.println(b2);

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Water");
        drinks.add("Tea");
        drinks.add("Kymyz");

        cities.addAll(drinks);

        System.out.println(cities);

        cities.addAll(0, drinks);
        System.out.println(cities);

        cities.set(1, "Osh"); // replaces 1st element
        System.out.println(cities);

        cities.removeAll(drinks);// 'A' stays here because it does not belong to 'drinks',  but it belongs to cities object
        System.out.println(cities);//

        cities.addAll(0,drinks);
        System.out.println(cities);
        cities.removeAll(drinks);
        System.out.println(cities);



    }
}
