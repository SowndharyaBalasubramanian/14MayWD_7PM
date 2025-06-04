package com.branching;

public class Break {
    public static void main(String[] args) {
        for(int i = 3; i<=5; i++){
            System.out.println(i);
            if(i==3) {
                break;
            }
        }
    }
}
