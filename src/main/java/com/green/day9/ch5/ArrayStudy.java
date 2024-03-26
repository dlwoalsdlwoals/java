package com.green.day9.ch5;

public class ArrayStudy {
    public static void main(String[] args) {
        int n1=10, n2=20, n3=30, n4=40, n5=50;

        int[] numArr = new int[10]; //numArr엔 뉴인트 10칸이라는 주소값이 들어감
        //이건 값을 저장할 칸만 10칸 만든거
        int[] numArr2 = {10, 20, 30, 40, 50}; //0~4번
        //이건 칸도 만들고 값도 넣어둠
        System.out.println(numArr2[1]); //출력방법
        numArr2[1] = 25; //변경방법
        System.out.println(numArr2[1]); //변경되서 20에서 25로 출력


        int[] numArr3 = new int[] {10, 20, 30};

        String[] strArr = new String[5];
        /*
        배열쓰는 이유 같은 타입의 값을 편하게 쓰고 읽기 위해
        배열의 특징? 크기는 고정 생성 후 크기 변경 x
        index로 사용하고 0번부터 시작. 마지막 index값은 배열 크기 - 1 값이다.
        for문이랑 궁합이 굉장하다
        reference type은 값 설정 안하면 null
        primitive type은 값 설정 안하면 0
         */

    }
}
