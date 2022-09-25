package RecapJavaWithAhmet;

public class StaticInstanceBlock {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1.What is static as a keyword and why do you use it?
        Static as a keyword is a way to make your methods and variables accessible from other classes.
        It means you can access methods and variables without creating an object***
        ***The advantage of having static keyword is that you do not need to create an object
        *The disadvantage of having static keyword you cannot OVERRIDE the static methods
        *The disadvantage of having static keyword you cannot call non-static methods variables inside of static methods

        NOTE: I can definitely say that static as a keyword is really useful for my project

    2.What is static block and instance block?

        *These are type of block that called from system immediately. Iy means you don't need to call it directly.
        --> static block--> it will run only once and always first line (BANK OF AMERICA)
        --> Instance block --> it will run as many as objects you have.

    3.What is static variable?
        *It makes the variable belong to the class
        *It is shared (changeable for each object)--> common for each object
        *It can be accessed from other classes without creating and object

    EXAMPLES SEE BELOW AND OTHER CLASS TO SEE HOW IT WORKS
     */

   static double money = 1000; // family account now after making it static

    public static void spendingMoney(double amountOfMoney){

        money = money - amountOfMoney;

    }

    static{ // this is called static block
        System.out.println("BANK OF AMERICA");
        System.out.println("This is static block");
    }
    {// this is called instance block
        System.out.println("This is instance block");
        // it runs as many as objects you have!!!
    }

    public static void example(){
        System.out.println("Ahmet");

    }

}
