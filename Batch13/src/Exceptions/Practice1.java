package Exceptions;

public class Practice1 {
    public static void main(String[] args) {

        String str = "last day";
        // string str2 = "Last day"; compile time error
        //  System.out.println(str.charAt(99));

        // Task: covert this given string to integer
        System.out.println("Hello World");
        String str1 = "13B";

      try {
          System.out.println(str1.charAt(15)); // stuck here and caught the exception but ignores the other catch
          Integer.parseInt(str1);
      }catch (NumberFormatException exception){ //NumberFormatException
          System.out.println("This is catch block for 'NumberFormatException'");
      }catch (StringIndexOutOfBoundsException e){
          System.out.println("Catching String Index Out Of Bound Exception");
      }


      try {
          Integer.parseInt(str1);
      }catch (NumberFormatException exception){
          System.out.println("This is catch block for 'NumberFormatException'");
      }


    }
}
