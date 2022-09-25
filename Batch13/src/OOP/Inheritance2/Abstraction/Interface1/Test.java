package OOP.Inheritance2.Abstraction.Interface1;

public class Test {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        double d1 = triangle.calculateArea();
        System.out.println(d1);

        triangle.melt();

        Square square = new Square();
        square.calculateArea();

        Shape t1 = new Triangle();

        t1.getPerimeter();

        Shape sq1 = new Square();

        System.out.println(sq1.calculateArea());



    }
}
