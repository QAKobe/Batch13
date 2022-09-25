package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("Strawberry", "LA");
        map.put("Watermelon", "Chicago");
        map.put("Apple", "Madison");
        map.put("Potatoes", "Boise");
        map.put("Banana", "Miami");

        // print keys and values together
        // entrySet()
        System.out.println(map);
        System.out.println(map.entrySet()); // [Apple=Madison, Potatoes=Boise, Watermelon=Chicago, Strawberry=LA, Banana=Miami]

        Set<Map.Entry<String, String>> keysAndValues = map.entrySet();
        //[Apple=Madison, Potatoes=Boise, Watermelon=Chicago, Strawberry=LA, Banana=Miami]
        System.out.println(keysAndValues);

        // print out pairs one by one!

       for (Map.Entry<String, String> pair : keysAndValues){
           System.out.println(pair);
       }
        System.out.println("============================");

        System.out.println(map.keySet());
        System.out.println(map.values());








    }
}
