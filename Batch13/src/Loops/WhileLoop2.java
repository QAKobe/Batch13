package Loops;

public class WhileLoop2 {
    public static void main(String[] args) {

        int age =21;

        while (age <= 30){


            System.out.println("my age is " + age);
            age++;

            int zipcode = 123; // loop keeps creating int all over again when it is inside the loop
            System.out.println(zipcode);
            zipcode++;
            zipcode++;
            System.out.println(zipcode);

        }






    }
}
