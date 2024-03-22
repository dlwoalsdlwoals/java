package com.green.day6.ch3;

public class FlowEx1 {
    public static void main(String[] args) {
        int x = 10;
        //x=0 일 때, 참인 것은\n(개행)
        //System.out.printf("x= %d일 때, 참인 것은\n", x);

        String name = "슬랙";
        char bloodType = 'B';
        //슬랙의 혈액형은 B형입니다.

        System.out.printf("%s의 혈액형은 %c입니다\n", name, bloodType);
    }
}
