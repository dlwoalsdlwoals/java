package day3;

public class ForLoop {
    public static void main(String[] args) {
        //for(초기화 ; 조건식 ; 증감식 ) {반복하고 싶은코드}
        //      0       1       3            2
        for (int i=0; i<5; i++) {
            System.out.println("안녕");
        }

        for (int i=5; i<11; i++) {
            System.out.println("hello");
        }

        for (int i=5; i<11; i++) {
            System.out.println(i - 4 + "hello");
        }

        for (int i=100; i>96; i--) {
            System.out.println("bye");
        }
    }
}
