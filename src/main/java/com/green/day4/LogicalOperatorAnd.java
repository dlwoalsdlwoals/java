package com.green.day4;
//논리 연산자
public class LogicalOperatorAnd {
    //and연산자는 false가 힘들다
    public static void main(String[] args) {
        if(true && true && true) { //and
            System.out.println("true && true && true");
        }

        boolean r = true && true && true;
        System.out.println("r:" +r);

        boolean r2 = true && true && true && false;
        System.out.println("r2:" + r2);

        boolean r3 = true & true & true & true;
        System.out.println("r3:" +r3);

        boolean r4 = true & true & true & false;
        System.out.println("r4:" + r4);
    }
}
