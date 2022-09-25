package Primitives;

public class ComparisonOperators2 {
    public static void main(String[] args) {

        int kAge = 1;
        int requiredAge = 7;

        boolean canAttend = kAge < requiredAge;
        System.out.println(canAttend);

        boolean canAttend1 = kAge > requiredAge;
        System.out.println("can child attend? " + canAttend1);

        requiredAge = 14;
        boolean canAttend2 = kAge == requiredAge;
        System.out.println("Is the child's age 14? " + canAttend2);

        requiredAge = 18;
        boolean canAttend3 = kAge != requiredAge;
        System.out.println("Can attend " + canAttend3);


    }
}
