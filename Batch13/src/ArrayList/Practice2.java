package ArrayList;

import Objects.Cookie;
import Objects.Flower;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        List items = new ArrayList();
        Flower fl = new Flower("rose", 11);

        items.add("String");
        items.add(22);
        items.add(new Flower("rose", 11));

        items.add(fl);
        System.out.println(items);

        ArrayList list1 = new ArrayList();
        list1.add(33);
        list1.add(true);
        list1.add("Phone");
        list1.add(new Cookie());

        // add cookie object

        list1.add(new Cookie());

        //list1.add(new Scanner(System.in));
        System.out.println(list1);

        // Collections.sort(list1); this won't compile because we have objects from different classes

        System.out.println(list1.size());

      //  System.out.println(list1.get(5)); // 'IndexOutOfBoundsException' this pops up because index 5 is not created yet

        System.out.println(list1.get(list1.size()-1));

        System.out.println(list1.get(4));




    }
}
