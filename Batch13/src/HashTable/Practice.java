package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Rose", 2);
        hashtable.put("Sunflower", 1);
        hashtable.put("Lily", 5);
        hashtable.put("Daisy", 8);

        System.out.println(hashtable.size());

        System.out.println(hashtable.get("Daisy"));

        System.out.println(hashtable.keySet());

        System.out.println(hashtable.entrySet());

        System.out.println(hashtable.values());


        //no null key or value we can't put null for neither key nor value
        // hashtable.put(null, 4); // NullPointerException
        // --------------------------RUN TIME EXCEPTION---------------------
        // hashtable.put("Tulips", null); NullPointerException

        // Use entrySet method to get all pairs from hashTable and check if the key starts with letter 's'/'S'
        // send a message like following "Flower name could be Sunflower"

        for (Map.Entry<String, Integer> pairs: hashtable.entrySet()){

            if (pairs.getKey().startsWith("s")||pairs.getKey().startsWith("S")){

                System.out.println("Flower name could be Sunflower >> " + pairs.getKey());
            }
        }
    }
}
