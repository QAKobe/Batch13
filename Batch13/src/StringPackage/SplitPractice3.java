package StringPackage;

import java.util.Arrays;

public class SplitPractice3 {
    public static void main(String[] args) {

        String paragraph = "Today is Saturday. This is a very nice day to study. I am learning split method. It returns String Array.";

        String[] sentences = paragraph.split("\\.", 2);
        System.out.println(Arrays.toString(sentences));

        for (String sentence: sentences){
            System.out.println(sentence.trim());
        }
        System.out.println("------------------------------");

        String[] sentences1 = paragraph.split("!");

        for (String sentence: sentences1){
            System.out.println(sentence.trim());
        }

        // 06.18.2022 --> print out true if the day is 18 of june

        String date = "06.18.2022"; // [06, 18, 2022]
      String [] partsOfDate = date.split("\\.");

      for (int i = 0; i < partsOfDate.length; i++){
          if (partsOfDate[0].equalsIgnoreCase("06") && partsOfDate[1].equalsIgnoreCase("18")){

          }
      }
        System.out.println("Happy Birthday!!!");




    }
}
