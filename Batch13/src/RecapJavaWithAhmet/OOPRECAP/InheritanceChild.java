package RecapJavaWithAhmet.OOPRECAP;

public class InheritanceChild extends InheritanceRecap{

    String name;
    public InheritanceChild(String name){
        this.name = name;
    }

    public static void main(String[] args) {

        InheritanceRecap inheritanceRecap = new InheritanceRecap();
        //inheritanceRecap. while we are extending from InheritanceRecap class and can see its methods and variables

        InheritanceChild inheritanceChild = new InheritanceChild("Ahmet");
        //inheritanceChild. while we are extending from InheritanceRecap class and can see its methods and variables
        // NOTE: When you create a child class with extend keyword. Ypi can
        // access the parent variables and methods either directly from object OR
        // you can use super keyword to access them

        //NOTE2. Once you create a child class, if you are creating a constructor that
        // parent has but no child, then you need to use SUPER()




    }
}
