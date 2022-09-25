package OOP.Inheritance2.Abstraction.Interface1;

public class Triangle implements Shape, Material {

    int side1;
    int base;
    int side2;
    int height;


    public void melt(){
        System.out.println("Melting Triangle");
    }

    public Double calculateArea() {
        System.out.println("Calculate area of the triangle ");
        return (double) (height * base / 2);
    }

    public void getPerimeter() {

        int peri = side1 + side2 + base;
        System.out.println("Getting perimeter of the triangle " + peri);
    }

    public String build(){
        return "something";
    }


}
