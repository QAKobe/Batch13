package RecapJavaWithAhmet;

public class MultiDimensionalArray {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    *There is no specific interview verbal question for this part. But, there is a task about it.
    Task:
         -create an array and name it as cost(String)// $23, $45, $32, $18
         create another array month of array(String) // Jan, Feb, Aug, Oct
         // put them in a map format with multidimensional array(key, value)
         key is month
         value - cost
         output jan = 23, feb = 45, aug = 32, oct = 18
         tips; one loop is enough
         tips : String [][] results = new String[][];
     */
    public static void main(String[] args) {

        String[] cost = {"$23", "$45", "$32", "$18"};
        String [] month = {"Jan", "Feb", "Aug", "Oct"};
        String [][] allTogether = new String[2][4];

        for (int i = 0; i < cost.length; i++){

            allTogether[0][i] = month[i]; // all months
            allTogether[1][i] = cost[i]; // all costs
            System.out.println(allTogether[0][i]+ "="+ allTogether[1][i]);
        }

       // System.out.println(Arrays.deepToString(allTogether));








    }

}
