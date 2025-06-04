package com.looping;

public class Nested_For {
    public static void main(String[] args){
        for(int rows = 1; rows <=2 ; rows++) {
            System.out.println("Rows : " + rows);
         for (int col = 1; col <= 3; col++) {
                System.out.println("Col : " + col);
            }

        }
    }
}
