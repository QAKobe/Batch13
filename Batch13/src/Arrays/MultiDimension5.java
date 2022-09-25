package Arrays;

import java.util.Arrays;

public class MultiDimension5 {
    public static void main(String[] args) {

        char[][] symbols = {{'L', '%', '7'},{},{},{'w', '4'}};
        System.out.println(symbols.length); // 4
        System.out.println(symbols[0].length);// 3
        System.out.println(Arrays.toString(symbols[0]));

        boolean[] b1 = {true, false, false, false};

        boolean[][] b2 = {{},{true, false},{},{}, b1};

        System.out.println(Arrays.toString(b2[b2.length-1]));

        String[][][] example = { {{"e","2.5"},{"hi"}}, {{"bye"},{"hello", "there"}}, {{"last", "Array"}} };

        System.out.println(Arrays.deepToString(example));


        String name = "Three dimension example";
        // print out "hi" only

        System.out.println(example[0][1][0] + " " + name);// hard code style

        for (String[][] first : example){

            for (String[] second : first){

                for (String element : second){

                    if (element.equalsIgnoreCase("hi")){
                        System.out.println(element + " " + name);
                    }
                }
            }
        }










    }
}
