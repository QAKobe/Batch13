package Map;

import java.util.*;

public class Practice5 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Cookies", 10);
        map.put("Tea", 50);
        map.put("Chocolate", 20);
        map.put("Cups", 14);
        map.put("Plate", 20);


        // extract all keys from this map and store them in a new list
        Set<String> set = map.keySet();

        System.out.println(set);

        ArrayList<String> list = new ArrayList<>();

        //using for loop to get items from set and then store them in an arrayList one by one
        for (String str : set) {
            list.add(str);
        }
        System.out.println(list);


        // short way
        //over here converting keySet to ArrayList by passing it as a parameter in the ArrayList Constructor
        ArrayList<String> list2 = new ArrayList<>(map.keySet());
        System.out.println(list2);

        // extract all values from this map and store them in a new Array

        Collection<Integer> values = map.values();

        System.out.println(values);//[50, 14, 10, 20, 20]

        //creating integer to use it as an index number for array
        Integer[] numbers = new Integer[values.size()];
        int index = 0;

        for (Integer value : values) {
            numbers[index] = value;
            index++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("+++++++++++++++++++++");
        Collection values1 = new ArrayList<>(map.values());
        Object[] strValue = values1.toArray();
        System.out.println(Arrays.toString(strValue));

        Map m1 = new HashMap();


        printValues(map);
        printKeys(map);



    }
    // create a method that takes a map<String, Integer> and this method will print out values from given map one at a time

    public static void printValues(HashMap<String, Integer> map1) {

        Collection values = map1.values();
        for (Object value : values) {
            System.out.println("From method: " + value);
        }

    }

    public static void printKeys(HashMap<String, Integer> map2){
        Collection values = map2.keySet();
        for (Object value: values){
            System.out.println("From method two: " + value);
        }
    }


}
