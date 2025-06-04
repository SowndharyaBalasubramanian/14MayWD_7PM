package com.branching;

public class Labelling_Continue {
    public static void main(String[] args){
             loop1 :   for(int i = 1; i<=3; i++){
      loop2:   for(int j = 1; j<=3 ; j++){
                 if(j == 2){
                    System.out.println("The value of j : " + j + "The value of i : " + i );
                    continue loop2;

                }
          //System.out.println("The value of j : " + j + "The value of i : " + i );
            }
        }
    }
}

//i = 1,2,3 j = 1,3
