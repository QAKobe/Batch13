package Objects;

public class Math2Test {
    public static void main(String[] args) {

        Math2 math2 = new Math2();

        math2.sumCalculator1(2, 3);
        int sum2 = math2.sumCalculator2(2, 3);

        double result1 = 100 + sum2 * 25 - 1;
        System.out.println("Result1 is: " + result1);

        double result2 = 30 + math2.sumCalculator2(1, 1);

        System.out.println(result2);

        String x = math2.sumCalculator3(100, 100);

        System.out.println(math2.sumCalculator3(100, 100));
        System.out.println(x.equals(math2.sumCalculator3(100, 100)));
        System.out.println(math2.name("Kubanych ", "Abdyvasiev"));

        Math2 person = new Math2();
        person.name("Kubanych ", "Abdyvasiev");
        String myName = math2.name("Kuba", "Abdy");
        System.out.println(myName.concat("@gmail.com").toUpperCase());


    }
}
