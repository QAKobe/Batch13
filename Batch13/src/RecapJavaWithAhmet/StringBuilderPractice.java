package RecapJavaWithAhmet;

public class StringBuilderPractice {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1.What is the difference between String and StringBuilder?
        *String is immutable
        *StringBuilder is mutable
        *String has more methods than StringBuilder
        *StringBuilder has different methods that String -->Append, Reverse etc.

    2.What is the difference betweenBuilder and StringBuffer?
        *StringBuffer is synchronized      -->Thread safe
        *StringBuilder is non-synchronized -->NON-THREAD-SAFE
        NOTE: If you want to know more abut synchronization check javaCap4 video (map concept)

     */


    public static void main(String[] args) {

        // immutability
        String name = "Ahmet";
        name.concat("Baldir"); // you have to reassign it to another String variable to see the result
        System.out.println(name);// ahmet

        //mutability
        StringBuilder name1 = new StringBuilder("Ahmet");
        name1.append("Baldir");
        System.out.println(name1); // ahmet baldir

    }
}
