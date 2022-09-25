package OOP.Inheritance2.Abstraction.Interface2;

public interface CanFly {

    int WINGS = 2;
    int TAIL = 1;

    void fly();
    void landing();

    default void speeding(){ // with default, we can use body for the method
// so speeding is not an abstract method.
        System.out.println("This is default method in CanFly");
    }






}
