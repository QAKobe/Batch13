package Objects;

public class CupConstructor {

    /*
    Create these:
    Cup class
    isClean
    size
    materialType
 !> include one method in the CUP class
 !> create constructor to initialize all instance variables

     */

    boolean isClean;
    int size;
    static String materialType;
    int count;

    public boolean isClean() {

        System.out.println("This is isClean method");
        return isClean;

    }

    public CupConstructor(int size) {
        this.size = size;
    }

    // This will not compile since there is a constructor above with single parameter and same data type
//    public CupConstructor(int count){
//        this.count = count;
//    }

    public CupConstructor(boolean isClean, int size, String materialType) {

        System.out.println("blablabla");
        this.isClean = isClean;
        this.size = size;
        this.materialType = materialType;
        this.isClean();

    }

    public CupConstructor() {

        //System.out.println(); any code here should be below this code
        this(true, 5, "DirtMaterial");

        System.out.println();//this one is ok
        System.out.println();//this one is ok too

    }

    public CupConstructor(boolean isClean, int size, String materialType, int type){

        this.isClean= isClean;
        this.size = size;
        this.materialType = materialType;
    }


}
