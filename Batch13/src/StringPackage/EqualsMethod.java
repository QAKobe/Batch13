package StringPackage;

public class EqualsMethod {
    public static void main(String[] args) {

        String name1 = new String ("David");
        String name2 = new String ("David");

        String name3 = "David";
        String name4 = "David";

        String name5 = name1;

        System.out.println( name1.equals(name2));// true

        System.out.println(name3.equals(name4));//true

        System.out.println(name1 == name2);// false

        System.out.println(name3 == name4);//true

        System.out.println(name1.equals(name4)  );
        System.out.println(name1 == name4);

        System.out.println(name5.equals(name1));
        System.out.println(name5 == name1);

        // equals --> look for the values
        // == --> look if they are the same object or not ( if they are in the string pool with same value, it'll also return 'true')

        // use .equals to compare string values not objects








    }
}
