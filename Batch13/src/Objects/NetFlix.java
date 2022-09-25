package Objects;

public class NetFlix {

    String user;
    static String accountName = "Family plan";
    static double monthlyData = 200;

    public void streaming(double useAge) {
        monthlyData = monthlyData - useAge;
        System.out.println("After " + user + "stream, leftover data is: " + monthlyData);
    }

    public static void main(String[] args) {

        NetFlix netflix = new NetFlix();
        netflix.user = "Kids ";
        netflix.streaming(5);

        NetFlix netflix2 = new NetFlix();
        netflix2.user = "wife ";
        netflix2.streaming(10);


    }


}
