package com.green.day8ch4;

public class FlowEx13 {
    public static void main(String[] args){
        int sum =0;
        for(int i=1; i<=10; i++) {
            sum += i;
            System.out.printf("1부터 %d까지의 합 : %d\n, ", i, sum);
        }
    }
}
