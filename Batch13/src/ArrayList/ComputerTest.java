package ArrayList;

import java.util.ArrayList;

import static ArrayList.Computer.*;

public class ComputerTest {
    public static void main(String[] args) {

        Computer c1 = new Computer("Apple", "Pro", 11, 400);
        Computer c2 = new Computer("MSI", "GF16", 16, 1500);
        Computer c3 = new Computer("Lenovo", "ThinkPad", 14, 1150);
        Computer c4 = new Computer("Apple", "Air", 13, 1200);
        Computer c5 = new Computer("HP", "Thin", 17, 1350);

        ArrayList<Computer> devices = new ArrayList<Computer>();

        devices.add(c1);
        devices.add(c2);
        devices.add(c3);
        devices.add(c4);
        devices.add(c5);
        System.out.println(c5);


        System.out.println(devices);

        calculation(devices);
        findSum(devices);

        ArrayList<Double> devicesPrices = sumOfPrice(devices);
        System.out.println(devicesPrices);
        calculation(devices);
        System.out.println(devicesPrices);












    }
}
