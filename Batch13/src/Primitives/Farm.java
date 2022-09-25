package Primitives;

public class Farm {

    public static void main(String[] args) {


        int cows = 15, chickens = 40, eachCowsLeg = 4, eachChickenLegs = 2, totalLegs;
        totalLegs = (cows * eachCowsLeg) + (chickens * eachChickenLegs);


        System.out.println("There are total of " + totalLegs + " legs in this farm");

        double PriceOfCow = 1200; double PriceOfChicken = 11.99;

        double totalWorthOfFarm = (PriceOfCow * cows) + (PriceOfChicken * chickens);

        System.out.println("The worth of the farm is " + "$"+totalWorthOfFarm);

    }
}
