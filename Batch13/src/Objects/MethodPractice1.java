package Objects;

import java.util.Scanner;

public class MethodPractice1 {

    /*
    create a method that will cal age of person
    it should return the age as int
    it should also print the age
    create main method in the same class and test your code
     */


    public void ageOfPerson(int currentYear, int bornYear){
        int realAge = currentYear - bornYear;
        System.out.println("The age is: " + realAge);
    }

    public int ageOPerson(int bornYear, int currentYear){
        int realAge1 = currentYear - bornYear;
        return realAge1;
    }
    public String ageOfPerson(int bornYear ,String name){


        int age = 2022 - bornYear;

        return name + " Your age was in "+ age;
    }

    public static void main(String[] args) {


        MethodPractice1 object = new MethodPractice1();

        object.ageOfPerson(1989, "Kuba,");
        object.ageOfPerson(1989, "kuba");
        object.ageOfPerson(1990, "Sam", 2000);



    }
    /*
    overload this ageOfPerson method, get current year from user with scanner
    use current year in your ageOfPerson and print
    Alex...you're at the age of ....age...in .... 2022
     */

    public String ageOfPerson(int birthYear, String name, int currentYear){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is current year?");
        currentYear = scanner.nextInt();

        int age = currentYear - birthYear;
        System.out.println(name + " your age was " + age + " in " + currentYear);
        return name + " your age is " + age;

    }






}
