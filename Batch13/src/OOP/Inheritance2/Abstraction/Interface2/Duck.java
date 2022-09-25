package OOP.Inheritance2.Abstraction.Interface2;

import OOP.Inheritance2.Abstraction.Abstract1.Student;

// WE CANNOT MORE THAN ONE EXTEND. BUT FOR INTERFACE WE CAN IMPLEMENT COUPLE
public class Duck extends CanRun implements CanFly, CanSwim{

    public void run(){
        System.out.println("Duck is running");
    }

    public void fly(){
        System.out.println("Duck is flying");
    }

    public void landing(){
        System.out.println("Duck is landing");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }

    public void diving(){
        System.out.println("Duck is diving");
    }

    public void speeding(){
        System.out.println("Duck is speeding");
    }

}
