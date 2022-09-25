package Arrays;

public class Task2 {
    public static void main(String[] args) {

        // print numbers which are less than 30
        int[] studentIds = {44, 67, 21, 5, 55, 99, -35, 500};

        for (int i = 0; i < studentIds.length; i++){
            if(studentIds[i] < 30){
                System.out.println(studentIds[i]);
            }
        }
        System.out.println("==================");

        int index = 0;
        while (index < studentIds.length){
            if (studentIds[index] < 30){
                System.out.println(studentIds[index]);
            }
            index++;
        }







    }
}
