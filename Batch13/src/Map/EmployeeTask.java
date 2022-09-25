package Map;

import java.util.HashMap;

public class EmployeeTask {

    /*
    ====TASK:===========
-create an employee class with instance variables of name, city, age, id
-create one constructor to initialize instance variables
-create employeeTest class
-create 4 employee object and store them in a map
-while storing employees in the map, use their ids as key
-create a method to print only employee names from map
     */

    String name;
    String city;
    Integer age;
    Integer id;

    public EmployeeTask(String name, String city, Integer age, Integer id) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
