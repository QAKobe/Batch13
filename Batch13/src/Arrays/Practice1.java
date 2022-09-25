package Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] ids = new int[5];// the number 5 is just capacity of array. It might have different numbers too.

        System.out.println(ids);

        ids[1] = 11;
        ids[3] = 33;

        System.out.println(ids[0]);// 0 by default since we didn't assign any value to index '0'
        System.out.println(ids[1]); // 11
        System.out.println(ids[3]);
        System.out.println("-----------------");

        int l = ids.length;
        System.out.println("length of array is " + l);

        for (int i = 0; i < l; i++) {
            System.out.println(ids[i]);
        }

        ids[0] = 9;
        ids[1] = 88;// reassigning 88 to the index 1

        System.out.println(ids[1]);//88

        // printing/showing everything from array at once
        System.out.println(Arrays.toString(ids)); // [9, 88, 0, 33, 0]
        System.out.println("==================");
        ids[4] = 44;
        System.out.println(ids[4]);//44

        ids[5] = 55;// ArrayIndexOutOfBoundsException. (Run time error)
        System.out.println(ids[5]);// ArrayIndexOutOfBoundsException. (Run time error)


    }
}
