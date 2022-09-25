package Primitives;

public class LogicalNegation {
    public static void main(String[] args) {

        // LogicalNegation --> ! ==> it will be used on boolean variables or boolean conditions

        boolean isRed = !false;

        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(!isRed);//false

        System.out.println(5 == 5);
        System.out.println(!(5==5));
        System.out.println(true == false);
        System.out.println(!(true == false) == (true == false));


    }
}
