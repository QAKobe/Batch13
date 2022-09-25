package Objects;

public class CupTestConstructor {

    public static void main(String[] args) {

        CupConstructor cup = new CupConstructor(false, 12, "Ceramic");

        System.out.println(cup.materialType);// Ceramic

        cup.materialType = "Glass";
        System.out.println(cup.materialType);

        CupConstructor cup1 = new CupConstructor(true, 20, "Wood");

        System.out.println(cup.materialType);// which one will print? Glass or wood?

        System.out.println(cup.isClean);
        System.out.println(cup1.isClean);
        System.out.println("*****************");

        CupConstructor cup2 = new CupConstructor();
        System.out.println(cup2.isClean);// what is outcome? false

        CupConstructor cup3 = new CupConstructor();
        System.out.println(cup3.materialType);

        CupConstructor cup4 = new CupConstructor(true, 20, "lai", 55);
        System.out.println(cup4.materialType);








    }
}
