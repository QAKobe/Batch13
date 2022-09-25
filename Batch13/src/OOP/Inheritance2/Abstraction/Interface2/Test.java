package OOP.Inheritance2.Abstraction.Interface2;

public class Test {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.landing(); // coming from CanRun
        bird.fly(); // coming from CanFly
        bird.landing(); // coming from CanFly

        System.out.println("========================");
        Fish fish = new Fish();
        fish.swim();
        fish.diving();

        System.out.println("+++++++++++++++++++++++++");
        Duck duck = new Duck();
        duck.diving();
        duck.fly();
        duck.run();
        duck.swim();

        Bird bird2 = new Bird(); bird2.fly();
        CanFly bird1 = new Bird(); bird1.fly();

        Duck duck1 = new Duck(); duck1.swim();
        CanFly duck2 = new Duck(); duck2.fly();
        CanFly bird3 = new Bird(); bird3.fly();
        CanSwim duck3 = new Duck();
        CanRun duck4 = new Duck();

        // you can create object in three ways
        /*
        IMPORTANT NOTES:
        1-Reference side can be the same class as object class
        2-Reference side can be the super class
        3-Reference side can be interface
         */







    }
}
