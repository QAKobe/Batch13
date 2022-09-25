package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(111, "David");
        studentMap.put(222, "Myktybek");
        studentMap.put(333, "Anna");
        studentMap.put(777, "James");
        studentMap.put(555, "Bond");
        studentMap.put(1, "Vasya");

        System.out.println(studentMap);

        studentMap.put(111, "Sam");
        System.out.println(studentMap);

        studentMap.put(666, "Sam");
        System.out.println(studentMap);

        System.out.println(studentMap.get(666)); // this is going to return VALUE of the key -->

        System.out.println(studentMap.get(777));
        String name = studentMap.get(1);
        System.out.println(name);

        System.out.println(studentMap.get("Anna"));// returns null  because 'Anna' is not assigned as key but rather as value.

        // null key or null value

        studentMap.put(null, "Tima");
        System.out.println(studentMap);

        studentMap.put(null, "John");
        System.out.println(studentMap+"-------");

        studentMap.put(888, null);
        studentMap.put(444, null);
        studentMap.put(999, null);
        System.out.println(studentMap);

        // get() --> return VALUE for given KEY
        // Question-- create an email address for each student if student value is not null
        // print out those emails addresses

        studentMap.get(111); // --> Sam

        // we need to get all the keys
        Set<Integer> keys = studentMap.keySet(); // [null, 1, 999, 888, 777, 666, 555, 444, 333, 222, 111]
        System.out.println(keys);

        System.out.println("=================================");
        for (Integer key : keys) {
            System.out.println(studentMap.get(key));
            if (studentMap.get(key) != null) {
                System.out.println(studentMap.get(key).concat("@techtorial.com"));
            }
        }

        //how to reach out all values?

        Collection<String> values = studentMap.values();
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(values);

        // Task. Say HI yo each name

        for (String value : values) {

            if (value != null) {
                System.out.println("Hi " + value);
            } else {
                System.out.println("Bye " + value);
            }
        }


    }
}
