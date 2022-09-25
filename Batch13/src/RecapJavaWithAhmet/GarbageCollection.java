package RecapJavaWithAhmet;

public class GarbageCollection {
    /*
    POSSIBLE INTERVIEW QUESTIONS

    1-What is Garbage Collector and where is it coming from?
        --> it is a way cleaning unused data in the class from memory(most probably HEAP). This concept is very important!
        --> It is coming from System.gc()

    2-How can you prove if your garbage collector is working?
         **We can override finalize to prove gc is working

    3-How can you make the element garbage?
        **Yes, you can either assign null or assign it to other objects.(*)

    4-Can you call gc() many times?
        You can call only one time, and it is not guaranteed that it will work for %100.

    5-Do you have to call gc to clean up your codes?
        You do not have to call gc manually since it is automatically working as default

     */
}
