package ImmutableClass;

public class Town {
    private String name;
    private String state;
    private long population;

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public long getPopulation() {
        return population;
    }

    public static void main(String[] args) {
// HERE IN THE SAME CLASS WE ARE ABLE TO SET VARIABLES WITH NEW -->
        // VALUES AND USE IT BECAUSE PRIVATE INSTANCE VARIABLES ARE IN THE SAME CLASS
        // HOWEVER, IF WE ARE OUTSIDE THIS CLASS WE WOULD NOT BE
        // ABLE TO SET VARIABLES WITH NEW VALUES
        Town town = new Town();

        town.name = "Evanston";
        System.out.println(town.name);


    }


}
