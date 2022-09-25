package Objects;

import java.time.LocalDateTime;
import java.util.Random;

public class Employee {

    String id;
    String department;
    String city;
    int age;


    public Employee(String department, String city, int age) {
        Random random = new Random();
        random.nextInt(1000);
        //LocalDateTime.now();

        this.id = ""+random.nextInt(1000);
        this.department = department;
        this.city = city;
        this.age = age;
    }

    public void departmentChecker(){

        if(department.equalsIgnoreCase("IT")){
            System.out.println("Are you SDET or NO!?");


        }

    }

    public static void departmentChecker(Employee[] data){
       for (Employee employee: data){
           if(employee.department.equalsIgnoreCase("IT")){
               System.out.println("Are you JUST SDET?");
           }

       }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
