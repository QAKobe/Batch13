package wrapperClasses;

public class StringToPrimitives {

    public static void main(String[] args) {

        // converting String to an Integer
        String str = "15";

        int a = Integer.parseInt(str);
        System.out.println(a);

        // as double
        String str1 = "11.5";

        // from String to Wrapper Object
        Double decNumber = Double.parseDouble(str1);
        System.out.println(decNumber - 3);

        // int number1 = Integer.parseInt(str1); NumberFormatException

        //String str2 = "A"; You can't parse to Character

        String number3 = "true";
        boolean bl = Boolean.parseBoolean(number3);
        System.out.println(bl);

        Boolean tt = bl;
        System.out.println(tt.equals(bl));
















    }
}
