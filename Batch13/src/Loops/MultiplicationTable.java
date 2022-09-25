package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++){

            if (i==2 || i == 4){
                continue;
            }

            for (int q =1; q < 10; q++){


                System.out.println(i + "*" + q+ "="+ i*q );

            }
        }







    }
}
