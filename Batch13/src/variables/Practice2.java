package variables;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Practice2 {
    public static void main(String[] args) {
        //Declaring variable

        int number; // declaring variable which is giving data type and name for the variables

        // initializing Variable

        number = 12;// This process is initializing variable which is GIVING a value to the variable

        System.out.println(number);// it will show 12
        System.out.println(number + 50);

        int studentNumber = 45;
        int totalStudent = studentNumber;
        System.out.println(studentNumber-2);

        int itemNumber;
        //System.out.println(itemNumber); if it's not run yet, it will give compile time error.

        studentNumber = 100;// updating the value for studentNumber -->>reassigning a new value to the existing variable
        System.out.println("Student number is: " + studentNumber);
        System.out.println(totalStudent);
    }
}
