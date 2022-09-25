package Objects;

public class Flower {

    String color;
    String size;
    double price;
    String type;

    public Flower(String type, double price){

        this.type = type;
        this.price = price;

    }

    public Flower(String type, String size, String color, double price){

        this.type = type;
        this.price = price;
        this.color = color;
        this.size = size;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    public double priceChecker(Flower[] flowers){

        for (Flower flower : flowers){

            if (flower.price > 10){
                System.out.println(flower.type + " is $" + flower.price);
            }else {
                System.out.println("You're choosing a flower less than $10");
            }
        }

        return price;
    }

}
