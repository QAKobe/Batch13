package RecapJavaWithAhmet.OOPRECAP;

public abstract class AbstractPractice {  //Ghost class. Template class

    //NOTE: You can create both abstract and regular method>examoles are below
    public abstract  void calculation(); // You will override this and do your own thing

    public void calculation2(){
        System.out.println("Calculated");
    }

    protected abstract void calculation3();// I can use different access modifiers for abstract methods
}
