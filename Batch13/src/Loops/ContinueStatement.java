package Loops;

public class ContinueStatement {
    public static void main(String[] args) {

        LABEL:
        for (int i = 0; i < 9; i++){

           if (i == 5){
                continue;
            }

            INNER:
            for (int k = 0; k < 15; k++){

                if (k > 5 && k < 10){
                    continue;
                }
                System.out.print(i+ " <<- i  ");
                System.out.println(k + "<<- k");
                // break; --> it would terminate inner loop

               // System.out.println("Learning continue statement");
            }
            System.out.println("******************");
            // break; it would terminate larger loop
        }

    }
}
