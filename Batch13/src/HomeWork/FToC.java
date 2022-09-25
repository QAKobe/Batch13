package HomeWork;
import java.util.Scanner;
public class FToC {

    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);
        System.out.println("Enter Fahrenheit to convert to Celsius ");
        double Fahrenheit = temp.nextDouble();
        double newFahrenheit = (Fahrenheit - 32)* .5556;
        System.out.println(Fahrenheit + " Fahrenheit " + "will be " + (int)newFahrenheit + " Celsius");
    }
}
