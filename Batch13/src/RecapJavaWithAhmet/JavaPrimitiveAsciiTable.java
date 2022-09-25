package RecapJavaWithAhmet;

public class JavaPrimitiveAsciiTable {

    /*
    POSSIBLE INTERVIEW QUESTIONS

    1-What is Java and what is JDK, JVM, JRE?

    TIPS: Before interview check the name of interviewers to make yourself ready for the style questions



    1-Java is programming language: There are 3 pieces of Java

    JDK--> (Java development kit) which has specific libraries and it develops the application
    JRE--> (Java runTime Environment) which has libraries and set of software tools which are responsible for execution
    JVM--> (Java Virtual Machine) which is responsible for converting BYTE code to binary codes


    2 - PRIMITIVE DATA TYPE:

    *Whole numbers:

    -iny
    -long
    -byte
    -short

    *Decimals:
    -float-->f
    -double-->d

    *Condition
    -boolean-->true or false

    Question:
    short a =5;
    short b=6;
    short c = a + b - 2; // COMPILE TIME ERROR
    sout(c)

    answer: COMPILE TIME ERROR. ONCE YOU WORK ON ANY PRIMITIVES BELOW INT --> IT'LL BE CONVERTED INTO INT VARIABLES OR
    YOU CAN CAST IT(SEE EXAMPLE BELOW)

    3-ASCII TABLE:
    It is a way to store all the characters, symbols alphabets, numbers...etc. Java refers this table
    once you work on character(CHAR) primitive data type.

     */
    public static void main(String[] args) {

        // IT IS A TRICKY QUESTION!!!!!
        short a =5;
        short b=6;
      //  short c = a + b - 2; TRICKY PART IS HERE!!!!
        short c = (short) (a + b - 2);

        System.out.println(c);

        char letter = 65;
        char letter2 = 'g';
        int number = ('g');
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println(number);




    }


}
