package com.green.day12;

public class MymathTest {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.add(10,20);
        myMath.add(100,200);

        myMath.minus(100,50);
        myMath.minus(200,50);

        System.out.println(myMath.returnAdd(500, 600));

        int result= myMath.returnAdd(500, 600);


    }
}

class MyMath {
    //리턴메소드, void메소드
    //리턴타입void 메소드명add 파라미터()
    //{} 부분은 > 메소드 구현부
    void add(int n1, int n2) {
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
    }

    int returnAdd(int n1, int n2) {
        return n1 + n2;
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
    }
}
