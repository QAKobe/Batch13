package Map;

import java.io.IOException;
import java.util.*;

public class CountAndStore1 {
    public static void main(String[] args) {

        String name = "Kubanychhh";

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            if (!letterCount.containsKey(name.charAt(i))) {
                letterCount.put(name.charAt(i), 1);
            } else {
                letterCount.put(name.charAt(i), (letterCount.get(name.charAt(i))) + 1);
            }

        }

        String str = "This is a TECHnical INterVIEW"; // result 3;
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (Character.isUpperCase(array[i].charAt(0))) {
                count++;
            }

        }
        System.out.println(count);
        int counter = 0;
        for (String i : array){

            if (Character.isUpperCase(i.charAt(0))){
                counter++;
            }

        }
        System.out.println(counter);


        //System.out.println(letterCount);


        //System.out.println(letterCounter("xxxxyxxx"));

        String myName = "Aijamallll";
        Map<Character, Integer> letterCount1 = new HashMap<>();

        for (int i = 0; i < myName.length(); i++) {

            if (!letterCount1.containsKey(myName.charAt(i))){

                letterCount1.put(myName.charAt(i), 1);


            }else {
               int nameCount = letterCount1.get(myName.charAt(i));
               letterCount1.put(myName.charAt(i), nameCount+1);
            }

        }
        System.out.println(letterCount1);
        List<Object> list = new ArrayList();

        String str5 = "apple";

        String reversed = "";
        for (int i = str5.length()-1; i >=0 ; i--) {
            reversed+=str5.charAt(i);
        }
        System.out.println(reversed);









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
