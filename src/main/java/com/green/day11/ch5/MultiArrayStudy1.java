package com.green.day11.ch5;

public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] score = new int[3][5];

        score[0][0] = 5;
        score[1][1] = 10;
        score[1][3] = 50;

        for(int i=0; i<3; i++) {
            for(int z=0; z<score[i].length; z++) {
                System.out.printf("%d\t", score[i][z]);
            }
            System.out.println();
        }
    }
}
