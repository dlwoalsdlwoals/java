package com.green.day4;

public class LogicalOperatorNot{
    public static void main(String[] args) {
        boolean r = true && true && true;
        System.out.println("!!r:" + !!r);
        System.out.println("!r:" + !r);
        System.out.println("r:" + r);
        //!= 비교연산자
        //! 논리연산자

        //toggle 처리 예를들어
        boolean tg = true;
        tg = !tg;
        System.out.println("tg: " + tg);
        tg = !tg;
        System.out.println("tg: " + tg);
        tg = !tg;
        System.out.println("tg: " + tg);
        tg = !tg;
        System.out.println("tg: " + tg);

        int tg2= 0;



    }
}
