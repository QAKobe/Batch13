package Arrays;

import java.util.Arrays;

public class MultiDimension2 {
    public static void main(String[]args){

        String[][] citiesOfStates = new String[3][2]; // Illinois, Florida, California

        citiesOfStates[0][0] = "Chicago";
        citiesOfStates[0][1] = "Springfield";
        citiesOfStates[1][0] = "Miami";
        citiesOfStates[1][1] = "Tampa";
        citiesOfStates[2][0] = "LA";
        citiesOfStates[2][1] = "San Diego";


        for (String[] city : citiesOfStates){
            //System.out.println(Arrays.toString(city));
            for (String city2 : city){

                System.out.println((city2));

            }

        }

        // store FL cities in a new Florida Array

        String[] florida = citiesOfStates[1];
        System.out.println(Arrays.toString(florida));

        for (String cities : florida){
            System.out.println(cities);
        }
        citiesOfStates[2][1] = "San Francisco"; // ArrayIndexOutOfBoundsException error
        System.out.println(Arrays.deepToString(citiesOfStates));
















    }
}
