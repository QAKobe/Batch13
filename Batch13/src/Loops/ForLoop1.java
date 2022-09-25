package Loops;

public class ForLoop1 {
    public static void main(String[] args) {

        // print numbers 1 to 10

        for (int a = 1; a <= 10; a++){
            System.out.println(a);
        }
        //System.out.println(a); since 'a' is a local variable meaning it is inside the FOR LOOP, and we can't access it from outside
        // use for loop and print numbers from 5 to -5

        for (int x = 5; x >=-5 ; x--){
            System.out.println("x--> " +x);

        }
        System.out.println("--------------------------");
        int x = 5;
        for (   ; x >=-5;  ){
            System.out.println(x);
            x--;
        }
        System.out.println("++++++++++++++++++++++++");

//          BELOW CODE FOR LOOP IS INFINITE LOOP SINCE IT HAS NO CONDITION, NO UPDATE. SO, IT RUNS FOREVER UNTIL MEMORY RUNS OUT
       // for (  ;  ; ){
          //  System.out.println("Nothing in the for parameter parenthesis");
       // }


    }
}
