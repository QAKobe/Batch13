package Arrays;

public class Task3 {
    public static void main(String[] args) {

        // find out the biggest number from this given array
        // find the smallest number
        int[] studentIds = {-500, 44, -67, -21, -5, -55, 99, -35, -500, -11};
        int largest = studentIds[0];
        int smallest = studentIds[0];

        for (int i = 1; i < studentIds.length; i++){
            if (studentIds[i] > largest){
                largest = studentIds[i];

            }
            if(studentIds[i] < smallest){
                smallest = studentIds[i];
            }

        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);








    }
}
