package StringPackage;

public class MethodTask3 {
    public static void main(String[] args) {

        String str = " O  n e t o H E R O ";

        String part = str.replace("One", "ZERO").toUpperCase().trim().replace(" ", "").substring(0,6);
        System.out.println(part);
        System.out.println(str);
        System.out.println(str.replace("O n e ", "ZERO "));















    }
}
