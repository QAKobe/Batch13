package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int num[] = {2,4,3,5,7,3,5,6,12,65,2,1,8,54};

        for (int i = 0; i < num.length; i++){

            int temp = 0;
            for (int j = i+1; j < num.length; j++){

                if (num[i] > num[j]){

                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                }

            }

        }


        System.out.println(Arrays.toString(num));

    }


}






