package OOP.Inheritance2.Abstraction.Abstract1;

public class Test {

    public static void main(String[] args) {

        // Cannot create object from abstract class!!!!!!
     //   Student student = new Student();

        OnlineStudent onlineStudent = new OnlineStudent();

        System.out.println(onlineStudent.watch("Weekday"));

        System.out.println(onlineStudent.name);

        Alex alex = new Alex();

        System.out.println(alex.name);

        System.out.println(alex.age);

        OnlineOlga onlineOlga = new OnlineOlga();

        onlineOlga.eating();

        System.out.println(">>>" + onlineOlga.watch("Weekend"));

        onlineOlga.questions(4);


        // reference is parent object is child type
        OnlineStudent olga = new OnlineOlga();

        System.out.println(">>>" + olga.watch("Weekend"));

        Student student = new OnlineOlga();

        System.out.println("**** " + student.watch("Weekend"));









    }
}
