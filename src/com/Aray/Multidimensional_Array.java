package com.Aray;

import java.util.Arrays;

public class Multidimensional_Array {
    public static void main(String[] args){
        int [][] numbers = {{1,2,3}, {4,5,6}};
//        System.out.println(Arrays.deepToString(numbers));
//        System.out.println(numbers[0][1]);
         numbers[1][1] = 90;
        System.out.println(Arrays.deepToString(numbers));
        Arrays.sort(numbers);

    }
}
