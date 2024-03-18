package com.green.day2;

//비교연산자
//comarison operator
public class CompOprerator {
    public static void main(String[] args){
        //정수형 데이터 타입은 int형
        //이제 하는건 불린형(boolean), true와 false 값만 가지는 데이터 타입
        boolean b1 = true;
        boolean b2 = false;
        //boolean b3 = 32; 이렇게 안됨 무조건 true나 false

        boolean r1 = 10 > 9; //10이 9보다 초과?
        System.out.println(r1);

        r1 = 10 < 9; //10이 9보다 미만?
        System.out.println(r1);

        r1 = 10 >= 9; //10은 9보다 이상? 항상 =는 뒤에
        System.out.println(r1);

        r1 = 10 >= 10; //10은 10보다 이상? 항상 =는 뒤에
        System.out.println(r1);

        r1 = 10 <= 10; //10은 10보다 이하? 항상 =는 뒤에
        System.out.println(r1);

        r1 = 10 == 10; //10은 10과 같?
        System.out.println(r1);

        r1 = 10 != 10; //10은 10과 다름? !는 not이나 반대라는 의미
        System.out.println(r1);
    }
}
