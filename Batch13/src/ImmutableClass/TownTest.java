package ImmutableClass;

import ImmutableClass.Town;

public class TownTest {
    public static void main(String[] args) {
// THIS CLASS CANNOT SET VALUES TO VARIABLES BUT CAN READ THE PRIVATE
        // VARIABLES ONLY. CANNOT ASSIGN OR DO OTHER MANIPULATION DUE TO
        // PRIVATE IS LABELLED AS SUCH IN THE TOWN CLASS
        Town town = new Town();

        System.out.println(town.getName());
        System.out.println(town.getPopulation());
        System.out.println(town.getState());




    }
}
