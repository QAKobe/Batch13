package StringBuilder;

public class Task2 {
    /*
    create a method that will take a StringBuilder as parameter
    this method will find the sum of numbers from given StringBuilder
    show the sum ! make sure it is correct sum!
    dfaWE+-2-l&^--4[+5 --> 2 + 4 + 5 => 11
     */

 public static void findSum(StringBuilder number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {

            if (Character.isDigit(number.charAt(i))){
                sum +=  Integer.parseInt(""+number.charAt(i));
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {

      StringBuilder stringBuilder = new StringBuilder("asdsa111");

      findSum(stringBuilder);



    }
}
