package RecapJavaWithAhmet;

public class ConstructorPracticeHuman {

    // instance variables

    int age = 30;
    String name = "Ahmet";
    double height = 6.2;
    String eyeColor = "brown";
    double amountOfMuscles = 45.5;
    String lastName;

    public ConstructorPracticeHuman(){ // constructor can be private theoretically but normally don't

        System.out.println("This is my default constructor");

    }

    public ConstructorPracticeHuman(int age, String name, double height, String eyeColor, double amountOfMuscles, String lastName) {
        this(); // this() has to be first if used. And in this specific constructor this() refers to the ConstructorPracticeHuman
        this.age = age;
        this.name = name;
        this.height = height;
        this.eyeColor = eyeColor;
        this.amountOfMuscles = amountOfMuscles;
        this.lastName = lastName;
    }

    public String getName(){
        return name;
    }

    public void printName(){
        System.out.println("My kid's name is " + this.getName()); // (this.) means works only in this class
    }

    public void printInformation(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(height);
        System.out.println(eyeColor);
        System.out.println(amountOfMuscles);
        System.out.println(lastName);
    }

    // using gc()


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Your garbage collector has worked");
    }

    public static void main(String[] args) {

        ConstructorPracticeHuman human = new ConstructorPracticeHuman();
        human.printInformation(); // all the assigned variables will be printed because we assigned them directly in the class on top

        ConstructorPracticeHuman male = new ConstructorPracticeHuman(25, "Rotata", 7.6, "Green", 20.4, "Tatata");
        male.printInformation();
        ConstructorPracticeHuman female = new ConstructorPracticeHuman(26, "Ana", 5.6, "Blue", 20.3, "Merver");
        female.printInformation();
        ConstructorPracticeHuman kids = new ConstructorPracticeHuman(5, "Rotana", 2.1, "Brown", 5.6,"Mertata");
        kids.printInformation();

        String str = String.valueOf(male);
        System.out.println(str);


        System.out.println("My kid's age is " + human.getName());
        male =kids;
        female =kids;

        System.gc();









    }
}
