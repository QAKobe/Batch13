package ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class bubbleSortMethod {

    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int temp = 0;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {

        int nums[] = {3, 6, 2, 3, 1, 88, 43};
        bubbleSortMethod.bubbleSort(nums);

        String name = "kubanychhh";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length(); i++) {

            if (!map.containsKey(name.charAt(i))){

                map.put(name.charAt(i), 1);

            }else {
                int value = map.get(name.charAt(i));
                map.put(name.charAt(i), value+1);
            }

        }
        System.out.println(map);

    }

}
