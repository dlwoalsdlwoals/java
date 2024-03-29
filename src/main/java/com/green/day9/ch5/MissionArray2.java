package com.green.day9.ch5;

public class MissionArray2 {
    public static void main(String[] args) {
        int num[] = new int[10];

        for(int i=0; i<=num.length; i++) {
            int random = (int)(Math.random() * 21) + 10;
            num[i] = random;
            System.out.println(num[i]);
        }



    }
}
