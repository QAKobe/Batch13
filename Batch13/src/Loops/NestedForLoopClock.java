package Loops;

public class NestedForLoopClock {
    public static void main(String[] args) {

        FIRST:
        for (int hours = 1; hours <=11; hours++){

            SECOND:
            for (int min = 0; min < 60; min++){

                if (min >= 25) {
                    break FIRST;
                }

                THIRD:
                for (int second = 0; second < 60; second++){
                    System.out.println(hours + ":" + min + ":" + second);

                }

            }
        }






    }
}
