package Exceptions;

public class Practice2 {
    public static void main(String[] args) {

        String str = "13B";

        try {
            Integer.parseInt(str);
            System.out.println(str.charAt(21));
        }catch (RuntimeException runtimeException){

            System.out.println("Single catch with parent type of exception (RTE)");
        }










    }
}
