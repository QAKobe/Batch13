package Primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {

        int num1 = 35, num2 = 20 +15;

        boolean result1 = num1 == num2;
        System.out.println(result1);

        boolean result2 = num1 == num2--;
        System.out.println(result2);
        boolean result3 = num1 == num2;
        System.out.println(result3);
        num2++;
        System.out.println(num1 == num2++);
        System.out.println(num1 == num2++);
        System.out.println(num1==--num2);


    }
}
