package Loops;

public class ForLoop5 {
    public static void main(String[] args) {

        char i;

        for(i = 'A'; i <= 'Z'; i++)

        if (i != 'Z' && i != 'Q' && i !='W' && i != 'L'){
            System.out.print(i+ " - ");
        }else if (i == 'W'){
            System.out.print('w' + "- ");

        }else if (i == 'L'){
            System.out.print("*"+i+"*");
        }
        else {
            System.out.print(i);
        }














    }
}
