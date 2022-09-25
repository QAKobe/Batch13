package Objects;

import java.util.Arrays;

public class AnimalTest {
    public static void main(String[] args) {

        Animal cat = new Animal();

        System.out.println(cat.color);// default

        cat.color = "White";
        System.out.println(cat.color);// White

        System.out.println(cat.age);

        cat.age = 3;
        System.out.println(cat.age);

        System.out.println(cat.breed);
        System.out.println(cat.gender);

        cat.gender = 'F';
        cat.breed = "scottish";
        System.out.println(cat.gender);//F
        System.out.println(cat.breed);//scottish

        //create a dog object and assign/print all instance inside this class

        System.out.println("***************");
        Animal dog = new Animal();

        System.out.println(dog.color);

        dog.breed = "Husky";
        dog.age = 4;
        dog.color = "Gray";
        dog.gender = 'M';

        System.out.println(dog.color);
        System.out.println(dog.age);
        System.out.println(dog.breed);
        System.out.println(dog.gender);

        System.out.println(dog.color.concat(dog.breed).equalsIgnoreCase("GrayHusky"));//boolean

        // example for array with objects

        Animal[] animals = {cat, dog};

        // show the color of cat and animal by using this animal array

        System.out.println(animals[0].color);// white
        System.out.println(animals[1].color);// color of dog



        //========================
        System.out.println("----------------------------");

        for (Animal pet: animals) {

            System.out.println(pet.color);
            System.out.println(pet.age);
            System.out.println(pet.gender);
            System.out.println(pet.breed);

            System.out.println(">>>>next pet<<<<<");

        }







    }
}
