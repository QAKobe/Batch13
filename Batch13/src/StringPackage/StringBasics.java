package StringPackage;

public class StringBasics {
    public static void main(String[] args) {
        System.out.println("Sunday");

        String word = "Tuesday";
        System.out.println(word);

        String name = new String("David");
        System.out.println(name);

        System.out.println(word + name);
        word = name  + " Souza";
        System.out.println(word);
        System.out.println(name + " Souza");
        System.out.println(name);

        System.out.println( name + 55);
        System.out.println(6 + 7 + name );
        System.out.println(name + 6 + 7 );

        String result = name + " Brown ";
        System.out.println(result);
        result += result;//
        System.out.println(result);//

        //String is immutable (unchangeable), unless you reassign a new value or do concatenation(adding extra text/String to it)

        result = result + "Monday ";
        System.out.println(result);

        String flower = "Rose";
        System.out.println(flower);// Rose
        flower = flower.concat(" is red");
        System.out.println(flower);// Rose is red

        System.out.println(flower.concat(" and beautiful"));

        System.out.println(flower);

        int number = 5;//Primitives don't have behaviors or functions/methods. But OBJECTS have behavior/function

        String number1 = "1";
        number1  += "2";
        number1+=2;
        System.out.println(number1);




    }
}
