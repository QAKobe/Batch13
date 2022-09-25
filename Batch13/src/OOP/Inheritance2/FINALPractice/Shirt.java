package OOP.Inheritance2.FINALPractice;

public  class Shirt {

    String brand;
    final String COLOR = "Black";
    char size;

    public Shirt(String brand, char size) {
        this.brand = brand;
        this.size = size;
    }

    public final void wash(){
        System.out.println("Washing the Shirt");

    }

    public void sale(){
        System.out.println("Selling the Shirt");
    }

    public void wash(int lbs){

        System.out.println("Overloading");
        // we're able to overload final method from above
    }




}
