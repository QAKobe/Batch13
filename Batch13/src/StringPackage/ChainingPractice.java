package StringPackage;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ChainingPractice {
    public static void main(String[] args) {

        String str = " Sunday is good to learn ";

        // use multiple methods one after each

       boolean b1 = str.replace('o', '*').substring(str.indexOf('i')).trim().toUpperCase().contains("xxx");
        System.out.println(b1);

        boolean b2 = str.replace('o', '*').substring(str.indexOf('i')).trim().toUpperCase().contains("SUNDAY");

        System.out.println(b2);

        boolean b3 = str.replace('o', '*').substring(str.indexOf('i')).trim().toUpperCase().contains("LEARN");

        System.out.println(b3);





    }
}
