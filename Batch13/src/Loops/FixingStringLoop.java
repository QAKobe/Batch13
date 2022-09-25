package Loops;

public class FixingStringLoop {
    public static void main(String[] args) {

        String str = "tr4#y7!";
        int index = 0;
        int letterCounter = 0;
        int digitCounter = 0;
        int symbolCounter = 0;

        while (index < str.length()){

            char ch = str.charAt(index);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
            letterCounter++;

            }else if (ch >= '0' && ch <= '9'){
                digitCounter++;
            }else {
                symbolCounter++;
            }


            index++;

        }
        System.out.println("There are " + letterCounter + " letters in the given string");
        System.out.println("There are " + digitCounter + " digits in the given string");
        System.out.println("There are " + symbolCounter + " symbols in the given string");






    }
}
