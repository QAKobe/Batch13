package ProjectTeam;

public class Quarters {
    public static void main(String[] args) {

        double quarter = .25, dimes = .1, nickels = .05, pennies = .01;

        double quarter5 = quarter * 7, dimes3 = dimes * 3, nickels4 = nickels * 4, pennies8 = pennies * 8;
        System.out.println("The given coins are as follows: ");
        System.out.println(quarter5);
        System.out.println( dimes3);
        System.out.println( nickels4);
        System.out.println( pennies8);
        System.out.println("The total coins are " + (quarter5 + dimes3 + nickels4 + pennies8) + " US dollars");
    }
}
