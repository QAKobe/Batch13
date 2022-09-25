package RecapJavaWithAhmet;

public class PracticeObjectCar {

    // There are 4 ways to initialize instance variables
    String brand = "Mercedes Benz"; // we can directly initialize here!
    int year;
    double horsePower;

    public String getBrand() { //
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) { // assigned with methods
        this.horsePower = horsePower;
    }

    public void example(String name){
        String name1 = name;
     //  protected String name; cannot use access modifiers
        // System.out.println(name); no default value. it will give you compile time error
    }

    public static void main(String[] args) {

        PracticeObjectCar practiceObjectCar = new PracticeObjectCar();

        System.out.println(practiceObjectCar.brand); // Mercedes-Benz it was assigned directly
        System.out.println(practiceObjectCar.year); // 0
        practiceObjectCar.year = 2022; // assigned with object
        System.out.println(practiceObjectCar.year);
        System.out.println(practiceObjectCar.horsePower); // 0.0
        practiceObjectCar.setHorsePower(15.5);
        System.out.println(practiceObjectCar.getHorsePower());




    }
}
