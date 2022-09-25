package OOP.Inheritance2.Abstraction.Interface1;

public interface Shape {

    public int SIDE = 4;

    // these modifiers are redundant because by default Interface access modifiers are public

     Number calculateArea();


    // you cannot create regular method in the interface
//    void getPerimeter(){
//
//    }

    abstract void getPerimeter(); //  you don't have to write abstract


}
