package Loops;

public class WhileLoopString {
    public static void main(String[] args) {


        String word = "summer";

        int indexNumber =0;

        while (indexNumber < word.length()){

            System.out.println(word.charAt(indexNumber) + ",");
            indexNumber++;

        }

        int i = word.length()-1;
        while (i >= 0){
            System.out.println(word.charAt(i) + ",");
            i--;
        }
    }
}
