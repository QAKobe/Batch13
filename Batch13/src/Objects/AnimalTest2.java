package Objects;

public class AnimalTest2 {
    public static void main(String[] args) {

        Animal bird = new Animal();

        System.out.println(bird.color);
        bird.name = "Tweeter";
        bird.sleep();


        Animal cat = new Animal();
        cat.name = "Tom";
        System.out.println(cat.name);
        cat.sleep();

        Animal eagle = new Animal();

        eagle.name = "Bald Eagle";

        System.out.println(eagle.name);
        eagle.run();

        bird.run();

        System.out.println(cat.energy);
        cat.run();
        System.out.println(cat.energy);
        cat.run();
        cat.run();
        cat.run();
        System.out.println("cat's energy " + cat.energy);


        //what is the energy of eagle?// 60

        System.out.println("Eagle's energy " + eagle.energy);

        eagle.sleep();
        System.out.println(eagle.energy);
       // eagle.color = "Black and White";
        eagle.printInfo(); // will print Bald Eagle's info
        System.out.println("==============================");

        cat.printInfo();
        System.out.println("-----------------");

        bird.printInfo();
        System.out.println("----------------------");
        bird.sleep();
        System.out.println("---------------------");
        bird.printInfo();

        //if we want to run the bird till the energy is 50%? what should we do?

        for (int i = bird.energy; i >= 50; i = i -10){
            bird.run();
        }
        System.out.println(bird.energy);
        bird.sleep();
        System.out.println(bird.energy);











    }
}
