package Objects;

import java.util.Arrays;

public class FlowerTest {

    public static void main(String[] args) {

        Flower flower1 = new Flower("violet", "medium", "pink", 11);
        Flower flower2 = new Flower("rose", "medium", "red", 14);
        Flower flower3 = new Flower("lily", "small", "white", 5);
        Flower flower4 = new Flower("orchid", "large", "yellow", 7);
        Flower flower5 = new Flower("unknown", 22);

        Flower[] vase1 = new Flower[5];
        vase1[0] = flower1;
        vase1[1] = flower2;
        vase1[2] = flower3;
        vase1[3] = flower4;
        vase1[4] = flower5;


        Flower[] vase2 = {flower1, flower2, flower3, flower4, flower5};

        System.out.println(Arrays.toString(vase2));

        flower1.priceChecker(vase2);

        for (Flower name: vase1){
            System.out.println(name.size);
        }




    }
}
