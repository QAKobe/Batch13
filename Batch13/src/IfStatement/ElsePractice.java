package IfStatement;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ElsePractice {
    public static void main(String[] args) {

        String flower = "Violet";

        if (flower.startsWith("Vio")){

            System.out.println("This could be Violet");
        }else {
            System.out.println("This could be Rose");

        }

        System.out.println("=========================");

        if (flower.contains("let")){

            System.out.println("flower is VIOLET");
        }

        System.out.println("FLOWER COULD BE ROSE");

        System.out.println("=========================");

        if (flower.equals("Violet"))
            System.out.println("This is for Mustafa");

        else
            System.out.println("This is for you");
        System.out.println("Last print");









    }
}
