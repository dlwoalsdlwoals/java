package com.green.day5.ch2;

public class VarEx2 {
    public static void main(String[] args){
        int x =10, y = 20;
        System.out.println("x:" + x + ", y:" + y);

        int a = x;      // a 10
            x = y;     // y 1
            y = a;

        System.out.println("x:" + x + ", y:" + y);
        //x:20 y:10이 출력되면 된다.

    }
}
