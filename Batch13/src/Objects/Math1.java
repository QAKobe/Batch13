package Objects;

public class Math1 {

    /*
    create a method that finds sum two numbers and show it
     */

    public void sum() { // parameters are not given inside () but inside the block

        int a = 1, b = 2, sum = a + b;
        System.out.println("The sum of a and b is " + sum);
    }

    // these are called parameters
    public void sum1(int num1, int num2) { // parameters are given inside the ()

        int total = num1 + num2;
        System.out.println("Total is " + total);

    }


// create a method that will take two double number
    // this number will find the product of given numbers and show it
    // create a MathTest class and run the product method

    public void productFinder(double num1, double num2) {
        double total = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + total);

    }

    public static void main(String[] args) {

        Math1 object = new Math1();
        object.sum();
        object.sum1(5, 8);
        object.sum1(10, 15);
        object.productFinder(3.4, 4.7);
        object.productFinder(2.5, 2);

    }
}
