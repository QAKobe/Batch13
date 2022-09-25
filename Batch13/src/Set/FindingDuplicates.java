package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindingDuplicates {
    public static void main(String[] args) {

        // Eliminate repeating elements from given array.
        String[] array1 = {"a", "b", "c", "a", "d", "c", "k", "c"};

        System.out.println(Arrays.toString(array1));

        List<String> list = Arrays.asList(array1);
        System.out.println(list);

        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);

        // second way to convert

        HashSet<String> newSet = new HashSet<>();
        for (String word: array1){
            newSet.add(word);
        }

        System.out.println(newSet);

        // find out repeating elements and show them
        //--nested for loop
        System.out.println("____________________________");
        for (int i = 0; i < array1.length; i++){
            for (int k = i+1; k < array1.length; k++){
                if (array1[i] == array1[k]){
                    System.out.println(array1[k]);
                }
            }
        }

        HashSet<String> newSet2 = new HashSet<>();
        for (String word : array1){
            if (!newSet2.add(word)){
                System.out.println("Duplicate " + word);
            }
        }





    }
}
