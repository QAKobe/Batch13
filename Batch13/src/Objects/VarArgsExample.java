package Objects;

public class VarArgsExample {

    /*
    create a method that will find the sum of numbers from given array
     */

    public static int sumOfNumbers(int[] numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
        return sum;
    }

    // Solving the same question with var arg

    public static int sum1(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
        return sum;


    }
    /*
    create a method that will take String array and print following message "...name... take it easy relax"
     */

    public static void takeItEasy(String[] names) {

        for (String name : names) {

            System.out.println(name + " take it easy");
        }

    }

    //==========================================
    public static void takeItEasy1(String... names) {

        for (String name : names) {

            System.out.println(name + " take it easy");
        }

    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        sumOfNumbers(nums);
        sum1(10, 20, 1, 3, 20);

        System.out.println("--------------------");
        String[] people = {"Kuba", "Kate", "Huan"};
        takeItEasy(people);

        takeItEasy1("kuba", "leha", "Shuagina", "as many names as possible until 25");

        sum1(1,2);

    }
}
