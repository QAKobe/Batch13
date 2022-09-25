package wrapperClasses;

public class StringToWrapper {

    public static void main(String[] args) {

        String str = "17.5";

        //convert above string to wrapper object Float

        // valueOf();

        Float number = Float.valueOf(str);
        System.out.println(number + 10);
        float fl = Float.parseFloat(str);
        Float fl2 = Float.parseFloat(str);

        int num1 = 19;
        Integer i = Integer.valueOf(num1);
        System.out.println(i.equals(number));


    }
}
