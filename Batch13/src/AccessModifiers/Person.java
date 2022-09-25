package AccessModifiers;

public class Person {

    // access modifiers --> public, protected, default, private

    public String namePublic;
    protected int ageProtected;
    private String genderPrivate;
    double heightDefault;

    public void speakPublic(){
        System.out.println("Speaking Public");
    }

    protected void speakProtected(){
        System.out.println("Speaking Protected");
    }

    void speakDefault(){
        System.out.println("Speaking default");
    }

    private void speakPrivate(){
        System.out.println("Speaking private");
    }

    public static void main(String[] args) {

        Person bob = new Person();

        bob.namePublic = "BOB";
        bob.ageProtected = 21;
        System.out.println(bob.ageProtected);
        bob.speakProtected();
        bob.genderPrivate = "M";
        bob.speakPrivate();

    }









}
