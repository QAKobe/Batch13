package Arrays;

public class ForEachPractice1 {
    public static void main(String[] args) {

        String[] cities = {"Chicago", "Springfield", "Denver", "Miami", "Malibu", "New York", "Houston"};

        for (String city: cities){ // FOR EACH LOOP you don't need to give condition. Loop will start from beginning till the end.
            System.out.println(city);// there is also no update statement to update condition since there is no condition
        }//                    since city is a String type we can use any String method with it.


        // create an integer array give some values, and find the sum of numbers that you have in the array

        int[] numbers = {4,5,6,78,9};
        int total = 0;
        for (int numerics : numbers){

            total = total + numerics;
            System.out.println(total);

        }
        System.out.println(total);



    }
}
