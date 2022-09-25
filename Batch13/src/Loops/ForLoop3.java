package Loops;

public class ForLoop3 {
    public static void main(String[] args) {

        String str = "Today is the best day to practice for loop";



        int count = 0;
        for (int i = 0; i < str.length(); i++){

            if (str.charAt(i) == 't' ){
                System.out.println(str.charAt(i));
            } else if (str.charAt(i) == 'o') {
                count++;

            }


        }
        System.out.println("There are " + count + " letter o in the string");
        System.out.println("----------------------------------");
        int counter = 0;
        for (int index = 0; index <= str.length()-1; index++){

            if (str.charAt(index) == 'o'){
                counter++;
            }
        }
        System.out.println(counter);



    }
}
