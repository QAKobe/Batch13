package IntheritencePractice;

public class Cat extends DomesticAnimal{

    String name;

    @Override
    public void eat(){
        System.out.println(name + " is eAting ");
    }

    public void meow(){
        System.out.println("Cat is making a sound as meow");
    }

}
