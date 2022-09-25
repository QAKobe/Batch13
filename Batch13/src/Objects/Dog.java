package Objects;

public class Dog {

    String breed;
    String name; // whatever the name was time
    String color;
   static int food = 20;//whatever the last change
    /*
    create a method to initialize all instance variables except food
     */

    public void initialize(String breed1, String name1, String color1) {

        breed = breed1;
        name = name1;
        color = color1;

    }
    /*
    create a method that wil print "....name...is eating food. New food amount is:....
    this method should update food amount by decreasing 1lbs for every execution
    */

    public void eat() {
        --food;
        System.out.println(name + " is eating " + " and remaining food is " + food);
    }

    public static void play(String place) {

        // non-static variable cannot be called in the static method
        //example this --> System.out.println(name); wont be compiled because 'name' is not static
        Dog d = new Dog();
        d.name = "Playing King";
        System.out.println(d+ " is playing" + place);
        System.out.println("Dog is playing and not eating, so food amount is still:" + food);

    }

    public String toString(){
        return "This is one Dog";
    }


}
