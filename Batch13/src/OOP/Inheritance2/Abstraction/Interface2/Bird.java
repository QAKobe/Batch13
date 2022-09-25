package OOP.Inheritance2.Abstraction.Interface2;

public class Bird extends CanRun implements CanFly{

    int WINGS = 4;
    int TAIL = 2;

    public void fly(){
        System.out.println("Bird is flying");
    }

    public void landing(){
        System.out.println("Bird is landing");
    }

    public void run(){
        System.out.println("Bird is running");
    }





}
