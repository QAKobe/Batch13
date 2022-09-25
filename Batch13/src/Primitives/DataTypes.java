package Primitives;

public class DataTypes {
    public static void main(String[] args) {


        /*
        byte, short, int, long, float, double, char, boolean
         */

        byte num1 = 127;
        byte num2 = -128;
        // byte num3 = 200; byte data type can only store in range of -128 to 127
        short num3 = 4;

        num3 = num1;

        System.out.println(num3);

        int num4 = num1 + 5 + num3;
        System.out.println(num4);
        long num5 = 3;

        long num6 = 54545453345345L;

        //=========================

        float num7 = 2.3f;
        float num9 = 2;
        double num8 = 7;
        System.out.println(num8);

        //====char=========

        char letter = 'a';
        char number = '6';
        char symbol = '#';
        char number1 = 'T';
        System.out.println(number1);




        /*
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

         */

    }
}
