package IntheritencePractice;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.name);
        animal.color = "Brown";
        System.out.println(animal.color);

        System.out.println("-------------------------------");
        DomesticAnimal domesticAnimal = new DomesticAnimal();

        System.out.println(domesticAnimal.name);
        System.out.println(domesticAnimal.color);

        System.out.println("+++++++++++++++++++++++");
        WildAnimal wildAnimal = new WildAnimal();

        System.out.println(wildAnimal.name);
        System.out.println(wildAnimal.color);

        System.out.println("======================");
        Cat cat = new Cat();
        System.out.println(cat.color);

        cat.color = "Orange";
        System.out.println(cat.color);
        System.out.println(cat.name);

        System.out.println("*******************");
        Lion lion = new Lion();
        System.out.println(lion.name);
        System.out.println(lion.color);
        System.out.println(lion.age);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        animal.name = "Rex";
        animal.eat();

        domesticAnimal.name = "Domestic";
        domesticAnimal.eat();

        cat.name = "Ginger";
        cat.eat();

        animal.sleep();

        domesticAnimal.sleep();

        wildAnimal.sleep();
        lion.sleep();

        lion.eat();
        lion.eat(9);

        cat.meow();// meow is only available for cat
        lion.roar();
        lion.sleep("Jungle");
        lion.sleep();

        System.out.println(lion.name);


        Lion lion2 = new Lion();

        System.out.println(lion2.name);
        System.out.println(lion2.color);
        System.out.println(lion2.age);

        lion2.color = "White";
        System.out.println(lion.color);
        System.out.println(lion2.color);


    }
}
