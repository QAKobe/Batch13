package Objects;

public class GarbagePractice {

    public static void main(String[] args) {

        Flower flower0 = new Flower("Rose", 11);
        Flower flower1 = new Flower("Daisy", 10);
        Flower flower2 = new Flower("Lily", 5);
        Flower flower4 = new Flower("Lily", 5);

        Flower flower3 = flower1;
        System.out.println("----------------------------");

        System.out.println(flower0 == flower2);
        System.out.println(flower1 == flower3);
        System.out.println(flower2 == flower4);
        System.out.println(flower2.equals(flower4));
        System.out.println(flower2.type.equals(flower4.type));

        System.out.println("----------------------------");


        System.out.println(flower1.type);
        System.out.println(flower2.type);
        System.out.println(flower3.type);

        System.out.println(flower1);
        System.out.println(flower3);

        flower1 =null;
        System.out.println(flower3);

        System.out.println("****************");
        System.out.println(flower1);

        flower3 = flower1;
        System.out.println(flower3);

       // System.out.println(flower3.type); NullPointerException, you can't reach

        System.gc(); // This method call for gc(); will make sure unuseful(flower1 = null;) objects to take to garbage

       // System.out.println(flower3.price); we still cant see






    }
}
