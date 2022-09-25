package OOP.Inheritance2.Abstraction.Abstract1;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Alex extends SelfLearner{

    public Alex() {
        super("SELF", 1);
    }

    public void goToLibrary(){
        System.out.println("Alex is going to Library");
    }

    @Override
    public Integer watch(String day) {
        System.out.println("Alex is watching at library");
        return 3;
    }
}
