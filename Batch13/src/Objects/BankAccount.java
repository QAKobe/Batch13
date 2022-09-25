package Objects;

public class BankAccount {

    String bankName;
    String accountHolderName;
    double balance;
    int accountNumber;
    String userName;
    String password;
    boolean isLoggedIn;


    /*
    create a method to display all these
     */

    public void initialize(String bankName1, String accountHolderName1, double balance1, int accountNumber1, String userName1, String password1, boolean isLoggedIn1){

        bankName = bankName1;
        accountHolderName = accountHolderName1;
        balance = balance1;
        accountNumber = accountNumber1;
        userName = userName1;
        password = password1;
        isLoggedIn = isLoggedIn1;

    }

    public double deposit(double moneyPut){
        balance = balance + moneyPut;
        System.out.println("Your new balance after deposit amount of " + moneyPut+ " is " + balance);
        return  balance;
    }

    public double withdraw(double takenMoney){

        balance = balance - takenMoney;
        System.out.println("Your new balance after withdrawal amount of " + takenMoney + " is " + balance);
        return balance;
    }

    public boolean isLoggedIn(String userUserName, String userPassword){

        if(userName.equals(userUserName) && userPassword.equals(userPassword)){
            isLoggedIn = true;
            System.out.println("You successfully logged in");

        }else {
            isLoggedIn = false;
            System.out.println("Incorrect password");
        }
        return isLoggedIn;
    }






}
