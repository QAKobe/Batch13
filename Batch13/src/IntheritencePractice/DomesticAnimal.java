package IntheritencePractice;

public class DomesticAnimal extends Animal {

    String name;

    // override eat method
    @Override
    public void eat() {
        System.out.println(name + " is Eating");
    }


}
