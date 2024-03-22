package com.green.day6.ch3;
//p93~ 9495
public class OperatorEx1 {
    public static void main(String[] args) {
        int n1 = 3, n2 = 5;
        int r1 = -n1 - n2; //n1 앞에 잇는 -는 부호.
        System.out.println("r1 : " + r1);

        int r2 = n1 + n2 * n1 /n2; //사칙연산으로 곱하기 먼저 계산됨. 그 다음 나누기 다음 더하기
        System.out.println("r2 : " + r2);
        int r3 = n1 + ((n2*n1) / n2); //그냥 괄호로 구분 안헷갈리게
        System.out.println("r3 : " + r3);

        System.out.println("-------------");

        //증감연산자
        int i = 5, z = 0;
        i++; //쓰기
        System.out.println("i: " + i);

        i = 5;
        ++i; //쓰기
        System.out.println("i: " + i);

        i = 5;
        z = i++; //읽기 먼저 하고 쓰기 들어감 그래서 z : 5나옴
        System.out.printf("i: %d, z: %d\n", i, z);

        i = 5;
        z = 0;

        z = ++i; //여긴 쓰기 먼저하고 읽음 그래서 z : 6
        System.out.printf("i: %d, z: %d\n", i, z);

        System.out.println("------------");

        int k =10;
        System.out.println(k++); // 10 k먼저 읽혀서 (10 ++)
        System.out.println(++k); // 12
        System.out.println(++k); // 13
        System.out.println(k++); // 13 k먼저 읽고 ++ 라서 (13 ++)
        System.out.println(k); // 14




    }
}
