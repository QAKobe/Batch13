package IntheritencePractice;

public class WildAnimal extends Animal {

    @Override
    protected void sleep() {
        System.out.println("Wild animal is sleeping");
    }

    @Override
    public WildAnimal move() {
        System.out.println("Wild animal is moving");
        return new WildAnimal();
    }

    public Integer dance(int hours){

        System.out.println("Dancing wildly " + hours);
        return 1;


    }



}
