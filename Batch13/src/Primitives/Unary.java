package Primitives;

public class Unary {

    public static void main(String[] args) {

        int flower = 7;
        System.out.println(flower);

        flower++;
        System.out.println(flower);

        flower--;
        System.out.println(flower);

        flower--;
        flower--;
        flower--;
        flower++;
        System.out.println(flower);
        System.out.println("==========================================");
        int item = 6;

        int count = item-- + item--;// applied but reflection will be applied next time
        System.out.println(count);
        System.out.println(item);
        System.out.println("==========================");

        int num = 3;
        System.out.println(num++);// >> shows 3, num behind the scene is 4. num = 4
        System.out.println(num); // 4
        System.out.println(++num);// shows 5; num = 5
        System.out.println(num);// 5

        ++num;
        System.out.println(num);//6
        --num;
        System.out.println(num);//5

        --num;// it is 4 but not printed yet but in memory holding as 4 as of now
        System.out.println(--num);//3


    }
}
