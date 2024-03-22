package com.green.day6.ch3;
//p98 ~ 100
public class OperatorEx6 {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
       // byte c= (byte)(a + b);// System.out.println(c);

        int d = 1_000_000;
        System.out.println(d);

        long e = 1_000_000 * 1_000_000;
        //int1000000 * ing1000000인데 표현할 수 있는 값을 초과해서
        long f = 1_000_000 * 1_000_000L;
        System.out.println("e: " + e);
        System.out.println("f: " + f);

        double g = 10 / 3;
        //int끼리 나눠서 실수는 날아갔으니 g는 3.0
        System.out.println("g: " + g);

    }
}
