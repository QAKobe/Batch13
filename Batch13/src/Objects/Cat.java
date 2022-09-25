package Objects;

public class Cat {

    String name;
    int weight = 100;
    int food = 50;
    String color;
    int age;

    public void run(){
        weight = weight - 10;
        System.out.println("The weight of " + name + "is " + " after the run " + weight);
    }

    public void eat(){
        food = food - 10;
        System.out.println("The amount of food left after " + name + " has eating some food " + food);

    }

    public void catInfo(){
        System.out.println("The name is " + name + "\nThe color of the cat is " + color + "\nThe weight is  " + weight+
        "\nThe food is " + food);
    }

    public void setColor(String strColor){
        color = strColor;

    }

// create a method to get color of the cat

    public String getColor(){

        System.out.println("working cat");
        return color;
    }

   public void setName(String name1){

        name = name1;

   }

   public String getName(){
        return name;
   }



}


