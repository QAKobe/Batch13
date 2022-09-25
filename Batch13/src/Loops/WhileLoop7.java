package Loops;



public class WhileLoop7 {

    public static void main(String[] args) {


        // task to find remaining balance on an international phone call
        int balance = 40, call = 5, count = 0;

        while (balance > 0){

            count++;
            balance = balance - call;
            System.out.println("This is your " + count + ". call. Remaining balance is " + balance);
        }












    }
}
