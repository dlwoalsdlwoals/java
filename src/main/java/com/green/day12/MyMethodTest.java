package com.green.day12;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();

        mm.checkOddEven(10); //(콘솔출력) 짝수입니다
        mm.checkOddEven(11);
        mm.checkOddEven(100);
        mm.checkOddEven(13);

        int r = mm.abs(10);
        System.out.println(r); //10

        r = mm.abs(-8);
        System.out.println(r); //8

        int randomvalue = mm.getRandomValue(10);
        System.out.println(randomvalue);

        randomvalue = mm.getRandomValue(100);
        System.out.println(randomvalue);

        mm.printGugudan(5);
        mm.printGugudan(5);

        int randomvalue2 = mm.getRandomValue2(10, 20); //10~19
        System.out.println(randomvalue2);

        randomvalue2 = mm.getRandomValue2(5, 31); //5~30
        System.out.println(randomvalue2);




    }
}

//위치파악 > 리턴, void > 메소드명 > 파라미터
class MyMethod {
    void checkOddEven(int num) {
        //   String result = num % 2 == 0 ? "짝" : "홀";
        System.out.printf("%s수입니다.\n", num % 2 == 0 ? "짝" : "홀");

    }

    int abs(int a) {
        System.out.println("결과값:" + (a < 0 ? -a : a));
        return (a < 0 ? -a : a);
    }

    int getRandomValue(int a) {
        int randomvalue = (int) (Math.random() * a);
        return (int) (Math.random() * a);
    }

    void printGugudan(int b) {
        for (int i = 1; i < 10; i++) {
            System.out.print(b * i);
        }
    }

    int getRandomValue2(int c, int d) {
        return (int) (Math.random() * (d - c)) + c;
    }
}