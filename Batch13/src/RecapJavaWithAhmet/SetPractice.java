package RecapJavaWithAhmet;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-  How can you make the element unique with collection(American style)?
    1.1-What is set? What is the purpose of using it? (indian style)
    1.2-In what condition do you use set in your project? Can you give an example ?
        -->I can make all elements(data) unique by using SET collection.

    2-Can you tell me types of collections?
        There are 3 types of collections
        --SET
        --LIST
        --QUEUE(we did not cover and not necessary)


    3-Can you explain the difference between Set and List?
      List                                          SET
      1-Can store duplicates                        1-Only unique elements
      2-It has indexing(for, for each)              2-No indexing (for each loop)
      3-Syntax is different                         3-Syntax is different
        -List list = new ArrayList()                   -Set set = new HashSet();

    4-What are differences between Set Types?
    --> HashSet      --> it store elements randomly no order
    -->LinkedHashSet --> insertion order is kept(the way you assign)
    -->TreeSet       --> it stores the elements in ascending order

    NOTE: If you need more info go to YouTube

     */

    public static void main(String[] args) {

        Set numbers = new LinkedHashSet(); // LinkedHash insertion order is kept


        numbers.add(6);
        numbers.add(3);
        numbers.add(10);

        System.out.println(numbers);






    }
}
