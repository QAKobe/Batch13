package RecapJavaWithAhmet;

import java.util.Scanner;

public class Loops {
    /*
   POSSIBLE INTERVIEW QUESTIONS:

   1-Many technical interview questions, they require loops to solve questions
   LOOPS: It is a way to iterate(cycle) the elements(values, items, variables) one by one.
   In other words: it is a cycle for the repetitive actions.

   Types of loops:
   1-Do While
   2-While
   3-For Loop --> second best friend
   4-For each loop --> best friend

    Do While:
    do{
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    sout("press 2")
    }while(choice != 2)


    TASK1:
        Ask the user (Scanner) to input word and reverse it
        before you start can you tell me the path that you follow
        what would be your approach to solve this question?

    TASK2: by using while loop can you reverse the numbers and multiply digits?
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter a word please");
        String word = scanner.nextLine();
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--){

            reverse += word.substring(i, i+1);

        }
        System.out.println(reverse);


       int sum = 1;
       String reversed = "";  // 1453 --> % 10 --> 3. 1453/10 --> 145%10-->5 4. 1/10-->0
       int number = 1453;

       while (number != 0){

           int digits = number % 10; // 3
           sum *= digits;
           reversed += digits;
           number = number/10; // 145

       }

        System.out.println(sum);
        System.out.println(Integer.parseInt(reversed));








    }

}
