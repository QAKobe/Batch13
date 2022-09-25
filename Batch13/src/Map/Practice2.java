package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potatoes", "Boise");
        map.put("Banana", "Miami");

        // if name of the fruit or veggie is starting with 'A'/ 'a' show the city of it

        Set<String> key = map.keySet();
        System.out.println(key);

        for (String keys : key) {
            if (keys.startsWith("a") || keys.startsWith("A")) {
                System.out.println(map.get(keys));
            }
        }

        // contains()
        Boolean b = map.values().contains("Strawberry");
        System.out.println(b);

        Boolean b1 = map.containsValue("Strawberry"); // this is directly calling containsValue rather than individually typing it(See above code).
        System.out.println(b1);

        Boolean b2 = map.containsKey("Strawberry");
        System.out.println(b2);

        // remove()

        System.out.println(map);
        map.remove("Apple");
        System.out.println(map);

        map.remove("Strawberry", "LA");
        System.out.println(map);

        // replace()

        map.replace("Potatoes", "Denver");
        System.out.println(map);

        map.replace("Potatoes", "Denver", "St Charles");
        System.out.println(map);

        map.put("Potatoes", "Yuma"); // we replaced using put
        System.out.println(map);

        //map also has -->> size, clear, isEmpty

        System.out.println(map.size());

        System.out.println(map.isEmpty());

        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());


    }
}
