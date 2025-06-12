package com.class_Ex;

class ApplForm{

    public String name = "Bala";
    public static String collegeName = "ABC";
    //static String college = "ABCD";


    public void printDetails(){
        System.out.println("The name of the student : " + name + " and the student studies in : " + collegeName);
    }
}
public class Ex_Class {

    public static void main(String[] args){

        ApplForm Stu1 = new ApplForm();
        Stu1.name = "Sowndharya";
        Stu1.collegeName = "Besant";
      //  Stu1.college = "XYz";
        Stu1.printDetails();


        ApplForm Stu2 = new ApplForm();
        Stu2.name = "Collin";
        Stu2.collegeName = "XYZ";
        Stu2.printDetails();
        Stu1.printDetails();



    }
}


//concatenation
//first anme = sow
//last name = bala

//String result = first name + last name  =>sow + bala =>sowndhabala