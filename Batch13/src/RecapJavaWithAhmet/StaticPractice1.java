package RecapJavaWithAhmet;

public class StaticPractice1 {
    public static void main(String[] args) {

        // creating an object(account) --> bank of america

        StaticInstanceBlock ahmet = new StaticInstanceBlock();
        ahmet.spendingMoney(300);
        System.out.println(ahmet.money);

        StaticInstanceBlock mehmet = new StaticInstanceBlock();
        mehmet.spendingMoney(100);
        System.out.println(mehmet.money);
        StaticInstanceBlock.money = 2000; // you can access the variable without creating an object
        System.out.println(ahmet.money);




    }
}
