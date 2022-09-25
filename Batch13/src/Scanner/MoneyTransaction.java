package Scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 200, firstCheck, secondCheck, thirdCheck, phonePrice, headPhonePrice;
        System.out.println("Please enter first check amount");

        firstCheck = input.nextDouble();
        balance +=firstCheck;

        System.out.println("Please enter second check amount");

        secondCheck = input.nextDouble();
        balance +=secondCheck;

        System.out.println("Please enter third check");

        balance += input.nextDouble();

        System.out.println("Please enter Phone price");

        phonePrice = input.nextDouble();
        balance -=phonePrice;

        System.out.println("Please enter head phone price");

        balance -= input.nextDouble();

        System.out.println("This is your final balance " + balance);



    }
}
