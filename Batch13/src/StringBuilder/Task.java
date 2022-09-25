package StringBuilder;

public class Task {
    public static void main(String[] args) {

        /*
         Task
         write a java code to print lower case of alphabet by separated by comma
         write a java code to print upper case letters of alphabet as a single String value
         */

        char c;

        for (c = 'a'; c <= 'z'; ++c) {
            System.out.print(c + ", ");
        }
        char b;
        String letters = "";
        for (b = 'A'; b <= 'Z'; ++b) {
            letters = letters + b;

            //System.out.print(b + " ");

        }
        System.out.println(letters);


    }
}
