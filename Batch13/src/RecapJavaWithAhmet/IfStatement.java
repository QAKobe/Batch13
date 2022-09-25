package RecapJavaWithAhmet;

public class IfStatement {
   /*
   POSSIBLE INTERVIEW QUESTIONS
   1-Many Technical questions have if statement conditions for the solution
    There are 2 conditions for if statements: True-False

    AND ==> TRUE && TRUE --TRUE          OR==> TRUE || TRUE --> TRUE
            TRUE && FALSE -- TRUE               TRUE || FALSE -- TRUE
            FALSE && FALSE --FALSE              FALSE || FALSE -- FALSE

     SUMMARY 1-FOR BOOLEAN LETS SAY THAT AND CONDITION THE ONLY WAY YOU MAKE THE 2 CONDITIONS
     OR MORE SITUATIONS TRUE --> BOTH OF THEM MUST BE TRUE
     SUMMARY 2-LETS SAY THAT FOR OR CONDITION THE ONLY YOU MAKE THE 2 CONDITIONS OR MORE SITUATIONS FALSE --> BOTH OF THEM MUST BE FALSE

    */
   public static void main(String[] args) {

       int cat = 20;
       int dog = 10;
       int rabbit = 5;

       if (cat > dog && rabbit > dog || cat < rabbit){
           System.out.println("This condition is TRUE");
       }else if(cat > dog && dog > rabbit || cat > rabbit){
           System.out.println("This condition is TRUE");
       }else {
           System.out.println("This condition is FALSE");
       }

       // TERNARY OPERATORS:

       String ternaryOperators = cat > dog && rabbit > dog || cat < rabbit ? "This condition is True" : "This condition is False";
       System.out.println(ternaryOperators);
       // NOTE: Ternary operators are really useful for automation and testing purposes since it is more efficient
       // --less amount of code
       //--clear to understand











   }
}
