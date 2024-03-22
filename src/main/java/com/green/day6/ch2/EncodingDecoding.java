package com.green.day6.ch2;

public class EncodingDecoding {
    public static void main(String[] args) {
        char c = 'B';
        int i = c;
        //원래는 int i = (int)c;로 해야하지만
        //자동형변환, 인코딩(의미는 암호화)
        char c2 = (char)i; //디코딩(의미는 복호화)

        System.out.printf("c: %c, i: %d, c2: %c\n", c, i, c2);
    }
}
