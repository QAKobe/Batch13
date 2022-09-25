package Loops;

public class DoWhile1 {
    public static void main(String[] args) {

        int a = 10, b = 15;
        do {
            System.out.println("DO WHILE LOOP");
            a++;

        }while (a < b);


        char letter = 'a';
        int count = 0;
        do {
            System.out.println("Hello World!");
            System.out.println("Count " + ++count);
            letter++;

        }while (letter <= 'e');








    }
}
