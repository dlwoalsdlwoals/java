package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayStudy2 {
    public static void main(String[] args) {
        int[] numArr = new int[100]; //0~99
        System.out.println(numArr.length);
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < 10; i++) {
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
        for (int i = 0; i < 10; i++) {
            numArr[i] = i + 1;
            System.out.printf("numArr[%d]: %d\n", i, numArr[i]);
        }
    }
}
