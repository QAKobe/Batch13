package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practice1 {
    public static void main(String[] args) {

        /*
        create an arrayList and store 6 colors
        print out each color from the arrayList one by one
         */

        ArrayList<String> colors = new ArrayList();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Brown");
        colors.add("Grey");
        colors.add("Pink");

        for (int i = 0; i < colors.size(); i++){

            Collections.sort(colors);
            System.out.println(colors.get(i));

        }
        System.out.println("+++++++++++++++++++++++++++++");
        Iterator iterator = colors.iterator(); // using iterator from collections

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        int num[] = new int[4];







    }
}
