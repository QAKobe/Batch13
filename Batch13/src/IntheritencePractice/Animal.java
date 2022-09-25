package IntheritencePractice;

public class Animal {

    String name;
    String color;
    int age;


    public void eat(){
        System.out.println(name+ " is eating");
    }

    // overloading eat()
    public void eat(int lbs){
        System.out.println("Eating " + lbs + " pounds of food");
    }

     void sleep(){
        System.out.println("Sleeping");
    }

    public Animal move(){

        System.out.println("Animal is moving");
        return new Animal();

    }

    public Number dance(int hours){
        System.out.println("Dancing for " + hours);
        return 12;
    }




}
