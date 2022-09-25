package RecapJavaWithAhmet;

import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {

        // LEARN THIS KIND OF QUESTIONS BECAUSE AUTOMATION WILL NEED THIS. A LOT!!!
        String[] fruits = {"Apple", "Banana", "Peach", "Apple", "Orange", "Strawberry", "Banana", "Apple", "Cherry", "Orange"};

        Map<String,Integer> map = new HashMap();

        for(String eachFruit:fruits){

            if(!map.containsKey(eachFruit)){
                map.put(eachFruit,1);
            }else{
                map.put(eachFruit, map.get(eachFruit)+1);
            }
        }
        System.out.println(map);

    }
    }

