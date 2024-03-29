package com.green.day9.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};
        int sum= 0;
        double rr = 0;

        for(int i=0; i < score.length; i++) {
            sum = sum + score[i];
        } System.out.println(sum);

        rr = sum ;
        rr = sum / score.length;
        System.out.println(rr);

    }
}
