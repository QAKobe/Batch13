package RecapJavaWithAhmet.OOPRECAP;

public class InheritanceRecap {

    /*
    POSSIBLE INTERVIEW QUESTION:

    1.What do you know about inheritance and how do you inherit two classes?
        *Inheritance is a way to make a connections(relationship) between classes

     */

    String name;
    int age;
    String country;

    public InheritanceRecap(){

    }
    public InheritanceRecap(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printCountry(){
        System.out.println("My country is " + getCountry());
    }
}
