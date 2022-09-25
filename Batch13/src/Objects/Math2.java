package Objects;

public class Math2 {

    public void sumCalculator1(int num1, int num2) {

        int total1 = num1 + num2;

        System.out.println("Total1 is: " + total1);
    }

    public int sumCalculator2(int num1, int num2) {

        int total2 = num1 + num2;
        System.out.println("Total2 is: " + total2);

        return total2; // you can return anything as INTEGER!!!!!

    }

    public String sumCalculator3(int num1, int num2) {
        int total3 = num1 + num2;
        return "The total3 is " + total3;
    }

    //create a method that takes your first name and last name
    // this will return your full name and also print your full name

    public String name(String first, String second) {

        String fullName = first + second;
        //  System.out.println("Your full name is " + fullName);
        return fullName;


    }


}
