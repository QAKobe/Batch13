package HomeWork;

public class FiveDigit {
    public static void main(String[] args) {
        int number = 52849, a, b, c, d, e;

        a = number % 10;
        number = number / 10;

        b = number % 10;
        number = number / 10;

        c = number % 10;
        number = number / 10;

        d = number % 10;
        number = number / 10;

        e = number % 10;
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
