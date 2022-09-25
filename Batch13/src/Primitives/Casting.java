package Primitives;

public class Casting {

    public static void main(String[] args) {

        //larger numerical data type to smaller numerical data type

        long lg = 25;
        //int i = lg; compile time error, trying to store larger dt to smaller dt, requires casting

        int i1 = (int)lg;
        System.out.println("i1>>"+i1);

        long lg2 = 4564564575656L;
        int i2 = (int)lg2;
        System.out.println("i2>>" + i2);

        // from decimal to whole number

        double db1 = 2.3;
        System.out.println(db1);//2.3

        short sh1 = (short)db1;
        System.out.println(sh1);//2
        short sh2 = (byte)db1;
        System.out.println(sh2);

        byte bt1 = (byte)db1;
        System.out.println(bt1);
        char ch1 = 'd';
        short i3 = (short)ch1;
        System.out.println(i3);

        byte b1 = 4, b2 = 5;
        byte r1 = (byte)(b1 + b2);// we should cast the final result of the arithmetic operation to make dt to compile/match
        System.out.println(r1);

        short r2 = (short)(b1 + b2);

        short phone = 275;
        short phone2 = 800;

        short total = (short)(phone+phone2);
        System.out.println(total);




    }
}
