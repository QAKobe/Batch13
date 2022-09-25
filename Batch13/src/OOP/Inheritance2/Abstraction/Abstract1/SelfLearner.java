package OOP.Inheritance2.Abstraction.Abstract1;

public abstract class SelfLearner extends Student{

    public SelfLearner(String name, int age){
        super("Self", 0);
    }


    public void study(){
        System.out.println("Self Learner is studying");
    }

    public abstract void goToLibrary();

    // abstract method cannot be private
//    private abstract void party();






}
