package Objects;

public class NewFlowerTask {

    public boolean correctFlower(Flower flower1234) {

        if (flower1234.size.equalsIgnoreCase("Large") && flower1234.price > 10) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {

        Flower anyFlower = new Flower("Rose", "large", "red", 15);
        Flower anyFlower2 = new Flower("Rose", "large", "red", 9);

        NewFlowerTask object = new NewFlowerTask();

        Boolean thisIs = object.correctFlower(anyFlower);
        System.out.println(thisIs);

        boolean r2 = object.correctFlower(anyFlower2);
        System.out.println(r2);




    }
}
