package RecapJavaWithAhmet;

public class Arrays {
    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is difference between Array and ArrayList(we gonna add more info when we recap ArrayList)

    Arrays: is a storage for multiple elements

    1*- Array has a fixed size(you give the length for the array at the beginning, and it is not flexible)
    2*-Arrays cannot be manipulated (does not have methods)
    3*-Arrays can store primitives and String
    4*-Array has a length feature not a method though
    5*-Array has multidimensional form. ***

    INTERVIEW QUESTION TASK:
    Write an implementation that declare int array and find the: 1,2,3,8,12,65,76,5,22,12
    1-sum of even number (if task was multiply then even number would start with 1)
    2-sum of odd number
    3-Difference between them ()

    OUTPUT-120 SUM OF EVEN
    OUTPUT ->91 SUM OF ODD
    DIFFERENCE -->29(NOT MINUS -29)
    NOTE: YOU CAN USE GOOGLE TO LOOK FOR MEANING OF EVEN AND ODD NUMBERS

    7-10 MINUTES
     */
    public static void main(String[] args) {

        int [] number = {1,2,3,8,12,65,76,5,22,17};
        int totalEven = 0;
        int totalOdd = 0;
        int difference = 0;

        // use for each loop if you go with specifics, however, I did with traditional for loop
        for (int i = 0; i < number.length; i++){

            if (number[i] % 2 == 0){
               totalEven = totalEven + number[i];
            }else {
                totalOdd = totalOdd + number[i];
            }
        }

        difference = totalEven > totalOdd ? totalEven - totalOdd : totalOdd - totalEven;

        System.out.println(totalEven);
        System.out.println(totalOdd);
        System.out.println(difference);









    }
}
