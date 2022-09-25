package OOP.Inheritance2.Abstraction.Abstract1;

public class OnlineOlga extends OnlineStudent{

    String hobbies;

    public void questions(int numberOfQuestions){
        System.out.println("Olga is asking " + numberOfQuestions + " questions");
    }

    @Override
    public Integer watch(String day){
        System.out.println("Olga is watching more to learn");
        return 8;
    }

    public void workHard(String name, String str){ // changing parameters voids overriding, unless same data type used
        System.out.println("working hard");
    }





}
