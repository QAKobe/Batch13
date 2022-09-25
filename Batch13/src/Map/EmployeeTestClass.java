package Map;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeTestClass {
    public static void main(String[] args) {

        EmployeeTask worker1 = new EmployeeTask("Kuba", "Chicago", 33, 1);
        EmployeeTask worker2 = new EmployeeTask("Myktybek", "LA", 30, 2);
        EmployeeTask worker3 = new EmployeeTask("John", "Detroit", 19, 3);
        EmployeeTask worker4 = new EmployeeTask("Huan", "Oklahoma", 21, 4);

        HashMap<Integer, EmployeeTask> workerInfo = new HashMap<>();

        workerInfo.put(worker1.id, worker1);
        workerInfo.put(worker2.id, worker2);
        workerInfo.put(worker3.id, worker3);
        workerInfo.put(worker4.id, worker4);

        System.out.println(workerInfo);

        System.out.println(workerInfo.get(worker1.id)); //--> employee object

       printNames(workerInfo);
       printCity(workerInfo);




    }
    public static void printNames(HashMap<Integer, EmployeeTask> employeeTaskHashMap){


        for (EmployeeTask names : employeeTaskHashMap.values()){

            System.out.println(names.name);

        }


    }
    // create a method that prints city of worker whose age is 21 or less

    public static void printCity(HashMap<Integer, EmployeeTask> city){

        Collection<EmployeeTask> employeeTasks = city.values();
        for (EmployeeTask names : employeeTasks){
            if (names.age <= 21){
                System.out.println("Employees whose age is 21 and younger are live in " + names.city);
            }

        }


    }
}
