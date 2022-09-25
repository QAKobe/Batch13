package Blocks;

import AccessModifiers.Person;

public class AccessModifierTest {
    public static void main(String[] args) {
        Person johny = new Person();

        johny.namePublic = "John";
        System.out.println(johny.namePublic);
        johny.speakPublic();


    }
}
