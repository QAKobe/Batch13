package OOP.Inheritance2.Abstraction.Abstract1;

public class OnlineStudent extends Student{

    public OnlineStudent(){
        super("Alex", 23);
    }

   // Implements this method from Student class
    public void study(){
        System.out.println("Online student is studying at home");
    }

    // Implements this method from Student class
    public Integer watch(String day){

        System.out.println("Online student is watching via zoom");
        if (day.equalsIgnoreCase("weekday")){
            return 3;
        }else {
            return 4;
        }

    }

    @Override
    public void eating(){
        System.out.println("Online student is eating at home");

    }

    public void workHard(String name, String name3){
        System.out.println("working hard");
    }



}
