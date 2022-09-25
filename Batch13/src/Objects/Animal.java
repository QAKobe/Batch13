package Objects;

public class Animal {

    // instance variables, they are out of any block/scope of anything, but they are in class. They belong to objects

    int age;

    String breed;

    char gender;

    String color = "orange";
    String name;
    int energy = 100;

    public void sleep(){

        energy = 100;
        System.out.println( name + " is sleeping ");


    }

    // create a run method

    public void run(){

        energy = energy - 10;
        System.out.println(name + " is running");
    }

// create a method which prints out info about animal
    // name the method as 'printInfo'

    public void printInfo(){

        System.out.println("Name is " + name + "\nAge is " + age+
        "\nGender is " + gender +"\nBreed is " + breed + "\nEnergy is " + energy+
        "\nColor is " + color);


    }

}
