package com.branching;

public class Labelling {
    public static void main(String[] args){

//     loop1 :   for(int i = 1; i<=3; i++){
//    loop2:        for(int j = 1; j<=3 ; j++){
//                System.out.println("The value of j : " + j + "The value of i : " + i );
//                if(j == 2){
//                    break loop2;
//                }
//            }
//        }

//        loop1 :   for(int i = 1; i<=3; i++){
//            loop2:        for(int j = 1; j<=3 ; j++){
//                System.out.println("The value of j : " + j + "The value of i : " + i );
//                if(j == 2){
//                    break loop1;
//                }
//            }

//        loop1 :   for(int i = 1; i<=3; i++){
//            loop2:        for(int j = 1; j<=3 ; j++){
//                System.out.println("The value of j : " + j + "The value of i : " + i );
//                if(i == 2){
//                    break loop2;
//                }
//            }
 //       }

//        loop1 :   for(int i = 1; i<=3; i++){
//            loop2:        for(int j = 1; j<=3 ; j++){
//                System.out.println("The value of j : " + j + "The value of i : " + i );
//                if(i == 2){
//                    break loop1;
//                }
//            }
//        }

        loop1: for (int i=1; i<=3;i++)
            loop2: for (int j=1; j<=3;j++){
            if (i==3) break loop1;
            System.out.println("the value of j - "+j+" : the value of i - "+i);    }
    }
}


//j = 1, 2 , 3      i = 1,2