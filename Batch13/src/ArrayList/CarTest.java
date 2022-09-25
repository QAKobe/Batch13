package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {

        Car c1 = new Car("Mercedes", "AMG", "Black", 2021);
        Car c2 = new Car("Porsche", "Taycan", "Silver", 2022);
        Car c3 = new Car("Rivian", "Pick up", "Blue", 2023);

       List<Car> vehicles = new ArrayList<Car>();

        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(c3);
        System.out.println(vehicles);








    }
}
