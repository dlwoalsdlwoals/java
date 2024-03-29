package com.green.day12;

public class CardTest {
    public static void main(String[] args){
        System.out.println(Card.width);
        System.out.println(Card.height); //대문자 점 이면 백퍼 스태틱

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        System.out.printf("c1.kind: %s, c1.number: %d\n"
                , c1.kind, c1.number);

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;
        System.out.printf("c2.kind: %s, c2.number: %d\n"
                , c1.kind, c1.number);
    }
}
