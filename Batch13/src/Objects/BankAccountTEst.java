package Objects;

import java.util.Arrays;

public class BankAccountTEst {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();



        account.userName = " java";
        account.password = "123";
        account.isLoggedIn("java", "123");

        account.deposit(10000);
        account.withdraw(100);

        account.initialize("Chase", "Kubanych abdyvasiev", 5000, 12345, "kuba", "123", true);
        System.out.println(account.balance);






    }
}
