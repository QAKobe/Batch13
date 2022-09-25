package TernaryOperators;

public class PracticeTernaryString {
    public static void main(String[] args) {

        String name1 = "Techtorial";

        String name2 = "Academy";

        String result = name1.contains(name2) ? name1.concat(name2) : name1 + "Does not contain" + name2;
        System.out.println(name1.contains(name2) ? name1.concat(name2) : name1 + " does not contain " + name2);
        System.out.println(result);


        name1 = name1 + " " + name2;
        System.out.println(name1);

        String result2 = result.equalsIgnoreCase(name1) ? result.toUpperCase() : name1.toUpperCase();
        System.out.println(result2);

        System.out.println('a' > 'b' ? 6.5 : "Zachary");


        int a = 3, b = 5;

        int x = ++a + ++a + ++b;

        System.out.println(x > ++a + b ? a++ : b++);
        System.out.println(x);

        System.out.println("true".equals(true) ? "yes" : "no");

        System.out.println(5 != 5 ? "sunday" : 3 > 2 ? "morning" : "afternoon");








    }
}
