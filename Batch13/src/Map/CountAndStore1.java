package Map;

import java.util.HashMap;

public class CountAndStore1 {
    public static void main(String[] args) {

        String name = "Kubanychhh";

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            if (!letterCount.containsKey(name.charAt(i))) {
                letterCount.put(name.charAt(i), 1);
            }else {
                letterCount.put(name.charAt(i), (letterCount.get(name.charAt(i)))+1);
            }

        }

        System.out.println(letterCount);
        //System.out.println(letterCounter("xxxxyxxx"));


    }


//    public static HashMap<Character, Integer>letterCounter(String name){
//
//        HashMap<Character, Integer> letterCount = new HashMap<>();
//        for (int i = 0; i < name.length(); i++) {
//
//            if (!letterCount.containsKey(name.charAt(i))) {
//                letterCount.put(name.charAt(i), 1);
//            }else {
//                letterCount.put(name.charAt(i), (letterCount.get(name.charAt(i)))+1);
//            }
//
//        }
//        return letterCount;
//    }





}
