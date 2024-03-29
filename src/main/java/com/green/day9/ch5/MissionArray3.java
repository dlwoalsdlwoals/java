package com.green.day9.ch5;

public class MissionArray3 {
    public static void main(String[] args) {
        int[] numArr = {10, 20, 30};
        int s;
        System.out.println(numArr[0]);
        System.out.println(numArr[2]);

        s = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = s;
        System.out.println(numArr[0]);
        System.out.println(numArr[2]);
    }
}
