package AccessModifiers;

public class Test {
    public static void main(String[] args) {
        Person sam = new Person();

        sam.ageProtected = 32;
        sam.speakProtected();

        sam.heightDefault = 6;
        sam.speakDefault();




    }
}
