package Primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 3, b = 5, c = 8, d = b + 5;

        // +, -, *, /, %(modulus)

        System.out.println(c);
        c = c + b + d;

        System.out.println("The value of c is: " + c);

        System.out.println(c - 11);// 12

        int result1 = a * c;

        System.out.println(result1);// 3 * 23 = 69

        int result2 = result1 / 2;

        System.out.println(result2);// 69/2 = 34

        double result3 = result1 / 2d;

        System.out.println(result3);

        // modulus -->> % -->> remainder from division

        // 12 sandwich -->> 2 sandwich for each person. There are 5 people -- the remainder is 2

        int x = 11, y = 2;

        int remainder = x % y;

        System.out.println(remainder);//1

        System.out.println(16 % 10);//6

        double r2 = 53 % 3;

        System.out.println(r2);//2.0

        System.out.println(450 % 100);//50

        //Task

        int burgers = 35, kids = 10;

        System.out.println(burgers % kids + " burgers left over");







    }
}
