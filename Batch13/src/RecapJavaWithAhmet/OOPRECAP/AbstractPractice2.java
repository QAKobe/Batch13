package RecapJavaWithAhmet.OOPRECAP;

public class AbstractPractice2 extends AbstractPractice{ // Concrete class.And you can extend only one time
    //To be able to access other class data
    //1-I can create an object(If i create it will fail because it's an abstract class)
    // or I can extend my class


    @Override
    public void calculation() {
        System.out.println("Calculation");
    }

    @Override
    protected void calculation3() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

      //  AbstractPractice abstractPractice = new AbstractPractice(); you cannot create an objectb from this class
      // we need to extend from that abstract class

    }
}
