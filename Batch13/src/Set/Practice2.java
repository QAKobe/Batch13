package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    /*
    Set: * you cannot store duplicate elements in a set
		HashSet --> can store null value, no order
  LinkedHashSet --> can store null value, insertion order
		TreeSet --> no null value, ascending order
     */


    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        LinkedHashSet<String> link = new LinkedHashSet<>();
        TreeSet<String> tree = new TreeSet<>();

        set1.add("Tuesday");   link.add("Tuesday");   tree.add("Tuesday");
        set1.add("Monday");    link.add("Monday");    tree.add("Monday");
        set1.add("Friday");    link.add("Friday");    tree.add("Friday");
        set1.add("Wednesday"); link.add("Wednesday"); tree.add("Wednesday");
        set1.add("Thursday");  link.add("Thursday");  tree.add("Thursday");

        set1.add("Tuesday");   link.add("Tuesday");   tree.add("Tuesday");

        set1.add(null);         link.add(null);       // tree.add(null);

        System.out.println(set1);
        System.out.println(link);
        System.out.println(tree);

        tree.pollFirst();
        System.out.println(tree);

        tree.remove("Tuesday");
        System.out.println(tree);

        tree.pollLast();
        System.out.println(tree);


        System.out.println(tree.descendingSet());











    }
}
