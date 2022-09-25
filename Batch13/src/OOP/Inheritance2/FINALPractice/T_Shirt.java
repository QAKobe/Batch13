package OOP.Inheritance2.FINALPractice;

public final class T_Shirt extends Shirt{


    T_Shirt(){
        super("Java", 'L');

    }



   // @Override YOU CANNOT OVERRIDE FINAL WASH METHOD

//    public  void wash(){
//        System.out.println("Washing at normal speed for t-shirt");
//    }

    @Override
    public void sale(){
        System.out.println("Selling t-shirt for %20 mark down");
    }






}
