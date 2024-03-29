package com.green.day11.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {
                  {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };

        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                System.out.printf("%d\t", score[i][z]);
            }
        }
        int sum=0;
        for (int i = 0; i < score[0].length; i++) {
        }
        System.out.print(sum);

        //for (int i = 0; i < 4; i++) {
            //sum = //score[1][i] + score[1][i+1];
       // }
        //System.out.print(sum);

    }
}