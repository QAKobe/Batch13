package Objects;

public class AreaCalculator {

    // method will cal area of the square
    public void areaCalculator(int length){

        int areaOfSquare = length * length;
        System.out.println("Area of Square is: " + areaOfSquare);

    }

    // Overloading this method now(areaCalculator) to rectangle
    public int areaCalculator(int length, int width){

        int areaOfRectangle = length * width;
       // System.out.println("Area of Rectangle is: " + areaOfRectangle);
        return areaOfRectangle;
    }









}
