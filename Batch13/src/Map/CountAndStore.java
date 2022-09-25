package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountAndStore {
    public static void main(String[] args) {

        String[] alphabet = {"o", null, "c", "a",null, "j", "j", "u", "d", "c", "e", "d", "b"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String letter : alphabet) {

            if (!map.containsKey(letter)){
                map.put(letter, 1);
            }else {
                int value = map.get(letter);
                map.put(letter, value+1);
            }



        }


        System.out.println(map);

        System.out.println(Arrays.toString(alphabet));

        String name[] = {"ads","asds","rer3"};
        System.out.println(Arrays.toString(name));
        System.out.println(name);

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        String str = "Savrr";

        HashMap<Character, Integer> letter = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!letter.containsKey(str.charAt(i))){
                letter.put(str.charAt(i), 1);
            }else {
                letter.put(str.charAt(i), letter.get(str.charAt(i))+1);
            }

        }
        System.out.println(letter);

        String str2 [] = {"John", "Smith", "Adams","Adams"};
        Map<String, Integer> maps = new HashMap<>();

        for (String eachName:str2){
            if (!maps.containsKey(eachName)){
                maps.put(eachName, 1);
            }else {
                int value = maps.get(eachName);
                maps.put(eachName, value+1);
            }
        }
        System.out.println(maps);




        String str3 = "Aigerimmm";

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < str3.length(); i++) {

            if (!letters.containsKey(str3.charAt(i))){
                letters.put(str3.charAt(i), 1);
            }else {
                letters.put(str3.charAt(i), letters.get(str3.charAt(i))+1);
            }

        }

        System.out.println(letters);


        String str4="Kanyshai-Karalevna";
        Map<Character, Integer> str4letters=new HashMap<>();

        for(int i=0; i<str4.length();i++){
            if(!str4letters.containsKey(str4)){
                str4letters.put(str4.charAt(i),1);
            }else{
                str4letters.put(str4.charAt(i), str4letters.get(str4.charAt(i))+1);
            }

        }
        System.out.println(str4letters);

        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange"};

//        Task is: Get the output of total items --
//                OUTPUT: Apple =3, Banana =2, Peach = 1, Orange = 2, Strawberry = 1

        // TIP: you can use containsKey from map.

        HashMap<String, Integer> allFruits = new HashMap<>();

        for (String fruit : fruits){

            if (!allFruits.containsKey(fruit)){
                allFruits.put(fruit, 1);
            }else {
                int value = allFruits.get(fruit);
                allFruits.put(fruit, value+1);
            }

        }
        System.out.println(allFruits);

        for (Map.Entry<String, Integer> fr : allFruits.entrySet()){

            if (fr.getKey().contains("Banana")){

                fr.setValue(100);

            }

        }
        System.out.println(allFruits);












    }
}
