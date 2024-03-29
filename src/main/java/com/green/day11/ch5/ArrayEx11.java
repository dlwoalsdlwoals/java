package com.green.day11.ch5;

public class ArrayEx11 {
    public static void main(String[] args) {
        int len = 10;
        int[] numArr= new int[len];
        int[] counterArr= new int[len];

        for(int i=0; i < numArr.length; i++) {
            int random = (int) (Math.random() * 10);
            numArr[i] = random;
            System.out.print(numArr[i]);
        }
        System.out.println("");
        for(int z=0; z < numArr.length; z++) {
            int g=0;
            for (int k=0; k < numArr.length; k++) {
               if (z == numArr[k]){
                   counterArr[z] = ++g;
                }
            }
            System.out.print(counterArr[z]);
        }

    }
}
