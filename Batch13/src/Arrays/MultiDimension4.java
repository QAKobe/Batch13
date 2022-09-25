package Arrays;

public class MultiDimension4 {
    public static void main(String[] args) {

        /*
        computers
            dell, mac, acer, macPro, macAir
        tv
            samsung, lg, sony, hisense
        speakers
            alexa, google, jbl, sonnes, beats
            ---------------
            prices;
                computers
                    1400, 1100, 899.99, 2400, 1200
                tv
                    1500, 800, 765.99, 385.99
               speakers
                    99.99, 69.00, 150, 200, 15.99

               // TASK. "price for ....macair...is.....1200.. "
         */

        String[][] devices = { {"Dell", "Mac", "Acer", "MacPro", "MacAir"},{"Samsung", "LG", "Sony", "Hisense"},{"Alexa", "Google", "JBL", "Sonnes", "Beats"} };
        double[][] prices = { {1400, 1100, 899.99, 2400, 1200},{1500, 800, 765.99, 385.99},{99.99, 69.00, 150, 200, 15.99 } };

        for (int a = 0; a < devices.length; a++){

            for (int b = 0; b < devices[a].length; b++){

                System.out.println("the price for " + devices[a][b] + " is $ " + prices[a][b]);
            }
        }
        System.out.println("------------------------------");
        // i want to see device which is less than 1500
        for (int a = 0; a < devices.length; a++){

            for (int b = 0; b < devices[a].length; b++){

                if (prices[a][b] < 1500){
                    System.out.println(devices[a][b]);
                }
            }
        }

        for (int a = 0; a < devices.length; a++){

            for (int b = 0; b < devices[a].length; b++){

                if (devices[a][b].contains("Mac")){

                    System.out.println(devices[a][b] + " These are the products " + prices[a][b]);
                }
            }
        }

    }
}
