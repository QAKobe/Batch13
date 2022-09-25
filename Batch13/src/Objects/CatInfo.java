package Objects;

public class CatInfo {
    public static void main(String[] args) {

        Cat catInfos = new Cat();

        catInfos.catInfo();


        catInfos.catInfo();
        catInfos.run();
        catInfos.color = "White";
        System.out.println(catInfos.color);
        catInfos.setColor("blue");
        System.out.println(catInfos.color);

        catInfos.setColor("Orange");
        System.out.println(catInfos.color);

        catInfos.setName("ginger");

        String catName = catInfos.getName();
        catName = catName.concat("White");
        System.out.println(catName);

        catInfos.eat();
        catInfos.catInfo();
        catInfos.setColor("blackish");
        catInfos.eat();
        catInfos.getColor();
        System.out.println(catInfos.getColor());
        catInfos.name = "Myshyk";
        catInfos.catInfo();
        catInfos.getName();
        System.out.println( catInfos.getColor());
        catInfos.run();
        catInfos.run();


    }
}
