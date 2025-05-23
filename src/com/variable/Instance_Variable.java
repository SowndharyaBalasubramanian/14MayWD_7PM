package com.variable;

public class Instance_Variable {

   public byte age = 90;
    private String name = "Sowndharya";
    int mob = 34313772;

    public static void main(String[] args){

        Instance_Variable Stu1 = new Instance_Variable();
        System.out.println(Stu1.age);
        System.out.println(Stu1.name);
        System.out.println(Stu1.mob);

        Instance_Variable Stu2 = new Instance_Variable();
        System.out.println(Stu2.age = 89);
        System.out.println(Stu2.name = "Anitha");
        System.out.println(Stu2.mob= 78903);


    }
}
