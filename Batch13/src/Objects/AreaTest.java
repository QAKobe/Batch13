package Objects;

public class AreaTest {
    public static void main(String[] args) {

      AreaCalculator object = new AreaCalculator();

      object.areaCalculator(5);

      // calling areaCalculator for rectangle now
      object.areaCalculator(6,6);

      double number = object.areaCalculator(4,3);
        System.out.println(number);






    }
}
