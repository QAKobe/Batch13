package Primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {
        // pre-increment, pre-decrement -->> ++name, --name
        // post-increment, post-decrement -->> name++, name--

        int burgers = 20;

                    //20        //22            //23/2
        int sum = burgers++ + ++burgers + 5 + ++burgers/2;

        System.out.println("The sum is :" + sum);// 58
        System.out.println("Burger number " + burgers);

                    //24   b24 //24         //23
        int a = ++burgers, b = a++, c = --burgers;
        System.out.println(a);//25
        System.out.println(b);//24
        System.out.println(c);//23

        System.out.println(++a + --b);
        System.out.println("burgers " + c);
    }
}
