package com.inheritance;

public class Single_Inheritance {
    public static void main(String[] args){
        Dad d = new Dad();
        d.property();
       // d.show();

        Daughter da = new Daughter();
        da.education();
        da.property();


        Daughter.home = "Bangalore";

        da.size = 900;
        da.education();
        da.property();
        d.property();

    }
}

class Dad{
      int size = 567;

    static String home = "Chennai";

    public void property(){
        System.out.println("The area of the property is " + size + " feet2" + " " + home);
    }

    private void show(){
        System.out.println("The area is " + size + " location "  + home);
    }
}

class Daughter extends Dad{

    static int age = 25;
    public void education(){
        System.out.println("The child is educated" + " " + age + " " + " " + home + " "+size);

    }

    public void testing(){
       // show();
       // property();
    }


}
