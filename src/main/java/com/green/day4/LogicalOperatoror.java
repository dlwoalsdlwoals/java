package com.green.day4;

public class LogicalOperatoror {
    // or은 false가 힘들다 전부 false여야해서
    public static void main(String[] args) {
        boolean r = false || true || false;
        System.out.println("r:"+r);

        boolean r2 = false || false || false;
        System.out.println("r2:"+r2);
    }
}
