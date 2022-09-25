package StringBuilder;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Good morning");

        //insert
        builder.insert(0, "Hi, ");

        System.out.println(builder);

        //builder.insert(builder.length(), " Julia");

        // System.out.println(builder);

        builder.insert(builder.indexOf(" "), " Julia,");
        System.out.println(builder);

        //insert String[] to index right before 'G'
        // String[] = {"How, "is", "everything?"};


        String[] str = {"How", "is", "everything?" };

        builder.insert(builder.indexOf("G"), Arrays.toString(str));

        System.out.println(builder);

        // insert a boolean to the builder object
        builder.insert(2, true);
        System.out.println(builder);

        //delete
        System.out.println(builder.charAt(5));
        builder.delete(2, 6);
        System.out.println(builder);

        //delete entire array part from the builder object

        builder.delete(builder.indexOf("["), builder.indexOf("]") + 1);
        System.out.println(builder);

        //deleteCharAt()

        builder.deleteCharAt(builder.indexOf(","));
        System.out.println(builder);

        builder.deleteCharAt(8);
        System.out.println(builder);

        //builder.delete(200,100); // StringIndexOutOfBoundsException
        //System.out.println(builder); // StringIndexOutOfBoundsException

        //replace()
        builder.replace(5, 7, "**");
        System.out.println(builder);

        //replace double o's with $

        builder.replace(builder.indexOf("o"), builder.indexOf("d"), "$$");
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();

        String str1 = "Java";

        builder1.append(str1);

        builder1.reverse();
        System.out.println(builder1);



    }
}
