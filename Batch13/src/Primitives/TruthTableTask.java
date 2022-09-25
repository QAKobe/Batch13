package Primitives;

public class TruthTableTask {
    public static void main(String[] args) {

        int e1 = 100, e2 = 60, e3 = 50, reqAver = 70, requiredParticipation = 80, myParticipation = 100,
                requiredHW = 90, myHW = 100;
        int myAver = (e1 + e2 + e3)/3;
        System.out.println(myAver);
        boolean examPass = myAver >= reqAver;
        boolean partiPass = myParticipation >= requiredParticipation;
        boolean HWPass = myHW >= requiredHW;

        System.out.println("Are you passing the course : " + (examPass && partiPass && HWPass));

        int b = 6, c = 2;

        boolean result = b + 2 == 3 * c || !true && c < b/3;
        System.out.println(result);


    }
}
