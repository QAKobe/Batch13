package Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] numbers = {4,5,7,8,9};
        // find the missing number from sequence numbers
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++ ){
            sum1 = sum1 + numbers[i];
        }
          //find the sum of the numbers between 4 and 9?

        // missing number
        int sum2 = 0;
         for (int i = numbers[0]; i <= numbers[numbers.length-1]; i++){
             sum2 = sum2 + i;

         }
        System.out.println(sum2-sum1 + " is missing");









    }
}
