package RecapJavaWithAhmet.OOPRECAP;

public class AbstractInterface {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1.What is abstract?
        *Abstract is a way to organize the method with no body. It means whoever OVERRIDES this method they will do
        their OWN IMPLEMENTATION.

    2.Why do you need to have abstract class in your project?
        *For many methods, we need developers to make their own implementation in the company, so they can create
        abstract class and methods with specific names that are not duplicates and let people call it based on
        their requirements(LIKE OVERRIDE AND DO YOUR OWN IMPLEMENTATION)

    3.Where do you use abstract class in your project?
        *I use almost everywhere in my project. Ex -> we have a robot that scans all the products form store and
        it sends a lot of data to us. We manipulate these data based on our implementation. These implementations
        are mostly created based on OOP concept which covers Abstract class as well

    4.Can you create an object from abstract class? If no, how are you going to access all the abstract methods from that class?
       *NO, you cannot create an object from Abstract class. I can access all the methods by OVERRIDING  after I use extends
        keyword between abstract and regular class.

    4.1. Can you have regular method under Abstract class?
        Yes you can!

    5.What is Interface?
        *We use implements keyword to make the class connected with interface
        NOTE: Interface is a blueprint of the OBJECT like class which has special methods that can be OVERRIDDEN.


    6.****What is the difference between Abstract and Interface?***
        INTERFACE:
        1.Interface keyword
        2.Interface can have only ABSTRACT METHODS(public abstract as default)-->DEFAULT KEYWORD(Exception-extra)
        3.To make a connection with Interface class we need to use "implements" keyword
        4*** In Interface you can use implements keyword as many as you want. That is the main reason why people use Interface
                -->child can have multiple parents
        5.You cannot create a constructor in Interface
        6.Methods access modifiers must be public abstract


        ABSTRACT:
        1.Abstract keyword
        2.Abstract can have both abstract and regular methods
        3.To make a connection with Interface class we need to use "extends" keyword
        4.In abstract, you can use "extends" keyword only once
               -->you can have only one parent
        5.You can create a constructor in Abstract
        6.Methods access modifiers can be anything(public, protected...)
     */

}
