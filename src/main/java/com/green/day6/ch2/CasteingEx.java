package com.green.day6.ch2;
//p75 ~ p84
public class CasteingEx {
    public static void main(String[] args) {
        //primitive type, reference type 같은 카테고리끼리는 형변환 가능
        //primitive type > reference type으로 형변환은 x 보통 int -> String
        //reference type > primitive type으로 형변환은 x 보통 String -> int
        //이 때는 파싱처리 (Wrapper 클래스 제외)
        int n1 = 10;
        Integer n2 = n1;

        double d1 = 10.0;
        Double d2 = d1;

        //강제형변환, 자동형변환

        //자동형변환되는 방향 (반대는 강제형변환)
        //byte -> short -> int -> long -> float -> double -> String(더하기 연산자일 때만)

        long l1 = 100000000L;
        float f1 = l1;
        System.out.println("f1 : " + f1);

        long l2 = (long)f1;
        System.out.println("l2 : " + l2);

    }
}
