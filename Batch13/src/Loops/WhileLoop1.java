package Loops;

public class WhileLoop1 {
    public static void main(String[] args) {

        //System.out.println("Sunday ");// 10 times? We would need to type 10 times to see the result

        int count = 0;

        while (count <= 10) {


            System.out.println(count + " Sunday ");

            count++;
        }

        System.out.println("This is a count after loop " + count);

        while (count >= 0) {
            System.out.println(count + " Morning");

            count--;
        }
        System.out.println(count);

        // int number = 4;
// below loop is called infinite loop because it will never stop since it has no condition update
        //      while (number == 4){

        //           System.out.println("Study");

   // }






    }
}
