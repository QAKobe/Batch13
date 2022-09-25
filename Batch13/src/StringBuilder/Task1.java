package StringBuilder;

public class Task1 {
    //create a function which takes a stringBuilder array as a parameters
    // this function will replace middle character with * if the word is odd

    void replaceMidChar(StringBuilder[] array){

        for (StringBuilder builder :array){

            if (builder.length() % 2 != 0){

                builder.replace(builder.length()/2, (builder.length()/2)+1, "*");
                System.out.println(builder);

            }

        }

    }

    public static void main(String[] args) {

        StringBuilder[] stringBuilders = {new StringBuilder("Apple"), new StringBuilder("Orange"), new StringBuilder("Grape")};

        Task1 task1 = new Task1();

        task1.replaceMidChar(stringBuilders);




    }
}
