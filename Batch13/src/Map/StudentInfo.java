package Map;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {

        HashMap<String, String> s1 = new HashMap<>();
        HashMap<String, String> s2 = new HashMap<>();
        HashMap<String, String> s3 = new HashMap<>();
        HashMap<String, String> s4 = new HashMap<>();

        s1.put("FirstName" ,"David");
        s1.put("LastName", "Pena");
        s1.put("Age", "25");
        s1.put("Gender", "M");
        s1.put("City", "Chicago");


        s2.put("FirstName","Jeremiah");
        s2.put("LastName","Johnson");
        s2.put("Age","15");
        s2.put("Gender","M");
        s2.put("City","Lake Forest");

        s3.put("FirstName","Michael");
        s3.put("LastName","White");
        s3.put("Age","35");
        s3.put("Gender","M");
        s3.put("City","Schaumburg");

        s4.put("FirstName","Sarah");
        s4.put("LastName","Star");
        s4.put("Age","29");
        s4.put("Gender","F");
        s4.put("City","Winnetka");

        ArrayList<HashMap<String,String>> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        System.out.println(list);
        nonChicagoResidents(list);
        ArrayList<String>studentEmails = emailCreator(list);
        System.out.println(studentEmails);


    }
    // create a function that takes an ArrayList as parameter
    // this method shows student's names and last names if they are older than 15 and not living in Chicago

    public static void nonChicagoResidents(ArrayList<HashMap<String, String>> infoList){

        for (HashMap<String, String> map : infoList){

           if ((Integer.parseInt(map.get("Age")) > 15) && (!map.get("City").equalsIgnoreCase("Chicago"))){

               System.out.println("First name: " + map.get("FirstName") + " Last Name: " + map.get("LastName") + " --> "+map.get("City"));
           }

        }
    }

    // create a method that returns list of email for each student using first name and last name
    public static ArrayList<String> emailCreator(ArrayList<HashMap<String, String>> infoList){

        ArrayList<String> emails = new ArrayList<>();
        for (HashMap<String, String> map : infoList){

            emails.add( map.get("FirstName")+"."+map.get("LastName")+"@yahoo.com" );

        }
        return emails;
    }


}
