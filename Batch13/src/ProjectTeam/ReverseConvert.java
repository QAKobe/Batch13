package ProjectTeam;

public class ReverseConvert {
    public static void main(String[] args) {

        double money = 2.36;// $2.36
        double numberOfPenny = money * 100;// we converted 2.36 into coins (236 coins/pennies)
        System.out.println("Number of coins " + (int)numberOfPenny);

        double quarter = numberOfPenny / 25;
        System.out.println("Number of quarters " + (int)quarter);

        double dimes = numberOfPenny % 25 / 10;
        System.out.println("Number of dimes " + dimes);

        double pennies = dimes % 1;
        System.out.println("Number of pennies " + pennies);

        System.out.println();




















        /*double money = 2.36, quarter = 0.25, dime = 0.11, nickel = 0, penny = 0.01;

        double newQuarter = money / quarter;
        System.out.println("Number of quarters " + newQuarter);

        double newDime = dime - penny;
        System.out.println("Number of dimes " + newDime);

        double newNickel = 0;
        System.out.println("Number of nickels " + newNickel);

        double newPenny = dime % penny;
        System.out.println("Number of pennies " + newPenny);

         */






    }
}
