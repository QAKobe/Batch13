package Blocks;

public class Practice {
    String name;
    static int number;

    // creating instance block, runs for every object
    {
        name = "Bob";
        System.out.println("Instance Block");
        run();
        System.out.println(number);
    }

    // creating static block, it runs only once and before everything in th class
    static {
        number = 100;
        System.out.println("Static block");
        awake();
    }

    public void run() {
        System.out.println("Running");
    }

    public static void awake() {
        System.out.println("Not sleeping");

    }
}
