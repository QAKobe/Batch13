package IntheritencePractice;

public class Lion extends WildAnimal {

    String name;
    static String color = "Orange";
    int age;

    // override method is overloaded but, it becomes brand-new method not overloaded or override
    public void sleep(String location) {
        System.out.println("Lion is sleeping in " + location);
    }

    public void roar() {
        System.out.println("Lion is roaring");
    }
    //override one parent method
    // introduce a new method for lion
    @Override
    protected void sleep() {
        System.out.println("Lion is sleeping");
    }

    public Lion move(){
        System.out.println("Lion is moving");
        return new Lion();
    }


}
