package com.strng;

public class String_Methods{
  public static void main(String[] args){

      String course = "Java is the backend language "; //
      String classes = "java is the backend language ";
      String car = new String("Java is the backend language ");
      String work = new String("Java is the backend language ");

      System.out.println(course.length());
      System.out.println(course.charAt(8));
      System.out.println(course.indexOf('a'));
      System.out.println(course.lastIndexOf('a'));
      System.out.println(course.toLowerCase());
      System.out.println(course.toUpperCase());
      System.out.println(course.concat(car));
      System.out.println(course + car);
      System.out.println(course.isEmpty());
      System.out.println(course.replace('a' , 'o'));
      System.out.println(course.startsWith("java"));
      System.out.println(course.endsWith("language"));
      System.out.println(course.equals(car));
      System.out.println(course == classes);
      System.out.println(classes == car);
      System.out.println(car.equals(work));
      System.out.println(car == work);

      String var = "Sowndharya said, \\She is a trainer in besant'";
      System.out.println(var);


  }
}
