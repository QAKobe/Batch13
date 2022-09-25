package IfStatement;

public class IfPractice1 {
    public static void main(String[] args) {

        System.out.println("This is beginning of the code");

        //if

        if (3 ==3){

            System.out.println("This is inside of IF Block");
        }

        if (3 == 5){

            System.out.println("This is SECOND IF Block");
        }

        System.out.println("This is end of the code");

        // You can have multiple if statements in the same class

        int apple = 20;
        int orange = 40;

        //print out hi when there are more number of apples than oranges
        //print out bye when there is same amount of apple and oranges

        if(apple>orange){

            System.out.println("Hi");
        }

        if (apple==orange){

            System.out.println("Bye");
        }

        //each apple costs $2 and each orange costs $3
        // you have 100 in your pocket
        // print out i can buy fruits if your money is enough to buy fruits


        int myMoney = 100, apple$ =2, orange$ =3, totalCost;

        totalCost = (apple$ * apple) + (orange$* orange);

        if ( totalCost <= myMoney){

            System.out.println("I can buy fruits");// this will not print since money(100) isn't enough money to buy
        }











    }
}
