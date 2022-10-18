package First;

public class HelloWorld {

    // This is main method, like engine of a car, it is needed to run the code
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("today is a sunny day");
        System.out.println("Java is easy to learn");
        
        String str = "Java is cool";
        String [] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {

            String reversed = "";
            for (int j = array[i].length()-1; j >=0 ; j--) {
                reversed += array[i].charAt(j);
            }
            System.out.println(reversed);
        }

        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {

            reversed+=str.charAt(i);

        }
        System.out.println(reversed);

        String irregular = "This Is An InterView now";
        String[] reversed1 = irregular.split(" ");
        int counter = 0;
        for (int i = 0; i < reversed1.length; i++) {

            if (Character.isUpperCase(reversed1[i].charAt(0))){

                counter++;

            }

        }
        System.out.println(counter);



    }


}

