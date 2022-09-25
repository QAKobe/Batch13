package HomeWork;

public class Variables {

    public static void main(String[] args) {

        int num = 30;
        int num2 = 19;
        int result = num - num2;
        System.out.println(result);// 11

        int reworkedResult = result;
        int x, y;

        x = result % 10;// remainder 1
        result = result / 10;// result becomes 1

        y = result % 10; // remainder 1
        result = result / 10;// result becomes 0

        System.out.println("The sum of " + reworkedResult + " is " + (x + y));

    }
}
