package Loops;

public class ForLoopMultipleTerms {
    public static void main(String[] args) {

        int a = 9;
        // reassigning variable in the loop
        for (a = 5; a < 17; a++){
            // a = 10; this will cause an infinite loop
            System.out.println("a is" +a);
        }
        System.out.println("a after loop " + a);

        int count = 0;
        for (int i = 0, k = 10, m = 25; i < 10 && k > i; i++, k--){

            m++;
            System.out.println("i -> " + i);
            System.out.println("k -> " + k);
            System.out.println("m -> " + m);
            count++;
            System.out.println("Iteration happened " + count + " times in this loop");

        }
        System.out.println("Iteration happened " + count + " times in this loop");

        char ch = 't';
        double num = 1.2;
        int count1 = 0;
        for ( double d = 2.3; ch > 'm' || d >= num; ch--, num++ ){
            System.out.println("**************");
            System.out.println(num+ "<< num");
            System.out.println(ch+ "<< ch");
            count1++;
        }
        System.out.println(count1);






    }
}
