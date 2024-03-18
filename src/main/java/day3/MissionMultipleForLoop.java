package day3;

public class MissionMultipleForLoop {

    public static void main(String[] args) {
        //int star = 2 ~ 6 사이의 랜던값 나올 수 있도록 세팅

        int star = (int)(Math.random()*5)+2;
        //최소값이 무조건 0이니 +2
        for(int i=0; i<star; i++){
            for(int k=0; k<star; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

