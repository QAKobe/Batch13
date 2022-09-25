package StringPackage;

public class Methods2 {
    public static void main(String[] args) {

        String city = "windy city is chicago";

        // indexOf(); --> returns index number of given char

        int num1 = city.indexOf('h');
        System.out.println(num1);
        System.out.println(city.indexOf('c'));// if there are more than one matching char in the given string,
                                            // it will return first matching char's index
       int num2 = city.indexOf('c', 1);
        System.out.println("second matching 'c' index is; " + num2);
        int num3 = city.indexOf('c', city.indexOf('c')+1);// do it after finding this
        System.out.println("second matching 'c' index with dynamic code:" + num3);

        int num4 = city.indexOf('x');// it'll return -1 meaning there is no matching char(there's no x) in the string
        System.out.println(num4);

        //"windy city is chicago"
        System.out.println(city.indexOf("go"));// it'll find matching char sequences from given string, if it matches,
                                                    // it will return first matching letters index

        System.out.println(city.indexOf('g') == city.indexOf("go"));//

        System.out.println(city.indexOf("city") == city.indexOf('c'));

        System.out.println("============================");





    }
}
