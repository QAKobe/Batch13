package ProjectTeam;


public class ConvertMinutes {
    public static void main(String[] args) {

        double minutesInYear = 60 * 24 * 365;

        double min = 1310400;

        System.out.println("input the number of minutes " + min);


        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

    }
}
