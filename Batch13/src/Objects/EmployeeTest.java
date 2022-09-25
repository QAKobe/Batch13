package Objects;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("IT", "Chicago", 21);
        Employee e2 = new Employee("SDET", "San Francisco", 21);
        Employee e3 = new Employee("DevOps", "Los Angeles", 21);

        Flower flower3 = new Flower("lily", "small", "white", 5);
        Flower flower4 = new Flower("orchid", "large", "yellow", 7);

        Employee[] worker1 = {e1, e2, e3};

        Object[] worker2 = {e1, e2, e3, flower3, flower4};

        e1.departmentChecker();
        e2.departmentChecker();
        System.out.println("------------------");

        Employee.departmentChecker(worker1);
        System.out.println("====================");
        //Employee.departmentChecker(worker2); can't read because 'worker2' is inside Object[] because Object[] has higher rank
        for (Object name : worker2) {
            System.out.println(name);
        }


    }
}
