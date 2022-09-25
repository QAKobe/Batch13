package Set;

import java.util.*;

public class Practice1HashSet {
    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet<>();
        Set set3 = new HashSet();
        Set<String> set4 = new HashSet<>();


        System.out.println(set2);

        set2.add(11);
        set2.add(22);
        set2.add(44);
        set2.add(66);

        System.out.println(set2);
        set2.add(33);
        System.out.println("Before adding duplicate " + set2);

        set2.add(33); // adding duplicate thou result will ignore that duplicate because hashset can't have duplicates due to safety
        System.out.println("After adding duplicate " + set2);

        set2.add(null);
        System.out.println(set2);

        // set2.get(); no get method! since it has no order

        for (Integer i : set2){
            System.out.println(i);

        }

        System.out.println("*************************");
        System.out.println(set2);
        // Iterator
        Iterator iterator = set2.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }














    }
}
