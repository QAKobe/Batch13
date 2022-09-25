package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {

        byte bt = 6;
        Byte b = new Byte(bt);
        System.out.println(b);

        Byte b1 = new Byte("7");

        Integer i = new Integer(5);

        Long l = new Long(100);
        System.out.println(l);

        Character c = new Character('C');
        System.out.println(c);

        Boolean bl = new Boolean(true);
        boolean blPrimitive = true;
        System.out.println(bl);
        System.out.println(blPrimitive);


        // Autoboxing
        Integer number = 11; // java is actually boxing this 11 as a new object. Meaning data is converted to Wrapper Object by java
        Integer number1 = 11;

        System.out.println("---------------------");
        System.out.println(number == number1);
        System.out.println(number.equals(number1));

        Integer rt = new Integer(5);
        Integer rt2= new Integer(5);

        System.out.println("******************");
        System.out.println(rt == rt2);
        System.out.println(rt.equals(rt2));

        // Casting --> auto casting --> smaller to larger
        // --> large to smaller or decimal to whole number

        Integer num3 = (int)3.4; // casting and autoboxing happened at once


        // From Wrapper to Primitive: Unboxing

        Integer num4 = 66;

        int num5 = num4; // Unboxing --> wrapper object is converted to primitive data

        Long num7 = 3L;

        Long num6 = (long)5.6;

        System.out.println((int)(5.6));
        Long num8 = Long.valueOf((int)(5.6));
        System.out.println(num8);






    }
}
