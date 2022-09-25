package OOP.Inheritance2;

public class Car extends Vehicle{

   // String model;
    String engineType;


    public Car(){

        super("AMG", "Mercedes Benz", 2022);

    }

    public Car(String engineType){

        super("Ford", 1999);
        this.engineType = engineType;

    }

    @Override
    public void moving(){
        System.out.println("Car is moving");
    }

    @Override
    Integer accelerate(){

        super.model = "GTR"; // practice how to use super keyword
        return 23;
    }

    @Override
    public String toString() {
        return "{" +
                "engineType='" + engineType + '\'' +
                ", model ='" + model + '\''+
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }
}
