package OOP.Inheritance2.Abstraction.Abstract1;

public abstract class Student {

    String name; // instance variable
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This is abstract 'study' method
    public abstract void study();

    // This is abstract 'watch' method
    public abstract Integer watch(String day);

    // This is regular (non-abstract) method
    public void eating(){

        System.out.println(name + " is eating");
    }




}
