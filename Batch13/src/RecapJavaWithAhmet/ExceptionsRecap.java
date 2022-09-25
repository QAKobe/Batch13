package RecapJavaWithAhmet;

public class ExceptionsRecap {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1.How do you handle the exceptions?
        *I can handle exception with try and catch block or throws

    2.Can you use more than once catch block? How about try block?
        No, you cannot use more than 1 try block. But, you can use as many as catch blocks you want.

    3.What do you know about final, finally, finalize
        --Final-->It is a way to make your method or variables final statement(last statement)--> not changeable-->static(final String name = "Bank Of America" )
        --Finally-->It is a block that comes after try and catch to show final execution. Ex-finally{"Have a good day"};-->when I close my database connection I use it
        --Finalize--> It is a method which works with GC(Garbage Collector) to make sure it is working manually.

    4.Throw and Throws?
        Both Throw and Throws are concepts of exception handling in which Throws an exception from method or any block of code.

        ***Throws is used in the signature of the method to indicate that this method might throw one of the exception.
        ***Throw is used in the block of code or methods.


     */
    public static void main(String[] args) {

        final String name = "Bank of America";

        try {
            String number = "353a";
            int sum = 0;

            for (int i = 0; i < number.length(); i++){
                sum+=Integer.parseInt(number.charAt(i)+"");
            }
            System.out.println(sum);
        }catch (NumberFormatException exception){
            System.out.println("There is a number format exception");
        }catch (IndexOutOfBoundsException index){
            System.out.println("There is an indexBountException");
        }finally {
            System.out.println("final decision of the exception and not matter what this finally block will run");
        }






    }
}
