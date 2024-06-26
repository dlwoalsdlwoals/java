package com.green.day9.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};
        /*
        score에서 가장 큰 값, 가장 작은 값 찾아내서 출력
        min : 33, max : 100
         */
        int min = 500;
        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < min) {
                min = score[i];
            } else if (score[i] > max) {
                max = score[i];
            }
        }
        System.out.println(min);
        System.out.print(max);
    }
}
