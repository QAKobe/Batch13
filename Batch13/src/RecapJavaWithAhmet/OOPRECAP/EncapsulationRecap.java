package RecapJavaWithAhmet.OOPRECAP;

public class EncapsulationRecap {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1.What is Encapsulation? Why do you use it?
    NOTE: Remember bacteria capsule example/post about cracking their security system from company
        -->Encapsulation is a way to limit/restrict/protect/hide data from 3rd part(foreign users/hackers/other classes)
        -->It makes your data not accessible and manipulable(manipulation) by everyone
        --> It provides control over the data.
        --> We use private keyword for variables and methods to encapsulate the data

    2.How can you access the data from encapsulated class?
        --To be able to access data from encapsulation, we use Getters and Setters.

    3.If encapsulation is hiding the data from users/classes and with some methods. It seems
    they can still access them then what is the point of using encapsulation?

    Actually, you can still access the data like you said,  but you can make a specific implementation with a condition
    that you want to have for this task which will restrict/limit users based on your condition. It means you protect your
    data to be manipulated in a negative way that you want to. Example = -15 age, -200 page or 10000 page. These are the values
    that we don't want to see for our database.

    --In real life environment--> it gives you correct/accurate data for you and/or company.
     */

    public static void main(String[] args) {

        EncapsulationPractice example = new EncapsulationPractice();
        example.setAge(12);
        example.setAge(-15);
        example.setAge(101);
        System.out.println(example.getAge());

    }

}
