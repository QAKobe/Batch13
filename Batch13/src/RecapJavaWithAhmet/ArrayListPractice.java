package RecapJavaWithAhmet;

import java.util.*;

public class ArrayListPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is the difference between Array and ArrayList?
    Arrays                                       ArrayList
    1-Fixed size                                 1-Dynamic Size/Flexible
    2-MultiDimensional Form                      2-Doesn't have this form(Multidimensional)
    3-Stores Primitives and Objects              3-Only stores Objects
    4-doesn't have methods for manipulations     4-Has many methods(add, remove, get, replace..etc)
    5-Syntax is different                        5-Syntax is different
        int [] number = new int [3];                List<Integer>number = new ArrayList();
        int [] number1 = {1,2,3};                   ArrayList<Integer> = new ArrayList();
   indexing:-> number[0]                                indexing --> number.get(0)
   NOTE: Common point of Array and Arraylist
   ******THEY BOTH ARE INDEXING

    2-What is the difference between ArrayList and LinkList?

    I do not use LinkedList in my project often but the efficiency of reaching out
    the element in ArrayList "Faster" than LinkedList.
    **IN Summary: the efficiency of ArrayList is better to reach out elements when
    manipulation happens the efficiency of LinkedList is better
    NOTE: if you need more information you can go to YouTube and watch the video.
    In addition to this, LinkedList has more methods/extra methods


     */

    public static void main(String[] args) {

        int [] numbers = new int[3];
        //numbers. nothing pops up because this one is not an object
        Object [] numer1 = {"1", true, 1,1.5, "Ahmet"};
        List<Integer> number = new ArrayList<>();
        LinkedList<Integer> numberLink = new LinkedList<>();
        numberLink.add(1);
        numberLink.add(2);
        System.out.println(numberLink.getFirst());
        System.out.println(numberLink.getLast());

        number.add(1);
        number.get(0);
        number.remove(0);












    }

}
