package OOP.Inheritance2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestForVehicles {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("GLC 300", "Mercedes", 2010);
        vehicle.start();
        System.out.println(vehicle.model);

        Object o = vehicle.accelerate();
        System.out.println(o);
        System.out.println("=====================");

        Car car = new Car();

        Integer number = car.accelerate();
        System.out.println(number + 1);

        System.out.println(vehicle.model);

        Vehicle v2 = new Vehicle("CRV", "Honda", 2021);
        System.out.println(v2.model);

        System.out.println(vehicle);

        System.out.println(car.accelerate());

        System.out.println(car.model);
        System.out.println(car.accelerate() + 1);

        Car car1 = new Car("Caterpillar");

        System.out.println(car1.year);


        Object name = v2.brand;

        List set = new ArrayList();

        set.add(car);
        set.add(vehicle);
        set.add(v2);

       // set.remove(name);

       // System.out.println(set);

        //set.removeAll(set);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(car);









    }
}
