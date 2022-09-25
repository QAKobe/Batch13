package Objects;

public class DogTest {
    public static void main(String[] args) {


        Dog dog1 = new Dog();

        dog1.initialize("German Shepherd", "Baikal", "Gray");

        dog1.eat();
        dog1.eat();

        Dog dog2 = new Dog();

        dog2.initialize("Belgium Shepherd", "Bobik", "Brown");

        dog2.eat();
        dog2.eat();
        dog2.eat();
        System.out.println(dog1.food); // 15
        System.out.println(dog2.food); // 15
        System.out.println(dog1.name);// Bobik because it is using the last info
        System.out.println(dog2.name);// Bobik because it is using the last info

        Dog dog3 = new Dog();

        dog3.food = 30;
        dog3.name = "Jolbors";
        System.out.println(dog1.food);
        System.out.println(dog2.food);

        // calling static play() method with object
        dog3.play("basement");

        // calling static play() method by using class name
        Dog.play("park");
        System.out.println("*********************");
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog2);

        Dog dog4 = new Dog();
        dog4.initialize("Laika", "Tuzik", "White");
        dog4.eat();
        dog2.eat();
        dog3.eat();
        dog3.eat();
        dog3.play("in the yard");









    }
}
