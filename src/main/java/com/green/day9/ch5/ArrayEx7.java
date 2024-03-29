package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i=0; i < numArr.length; i++){
            numArr[i] = + (i +10);
            System.out.print(numArr[i]);
        }
        System.out.print("\n");
        for(int z=0; z < numArr.length; z++){
            int random = (int)(Math.random() * 10);
            int s;
            s = numArr[random];
            numArr[random] = numArr[z];
            numArr[z] = s;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
