package defaultt;


import java.util.Random;

public class MainClass2 {
    public static void main(String[] args) {
        //2로 나눴을때 0이 나오면 짝수
        //1이 나오면 홀수
        Random r = new Random();
        int randomValue = r.nextInt(100); //r.nextInt();(랜덤숫자 출력) randomValue이라는 변수에 담기
        System.out.println("랜덤숫자"+randomValue+"입니다");
        if(randomValue % 2 == 1) {
            System.out.println("홀");
        }else {
            System.out.println("짝");
        }

        int a = 100;
        if(a <10) {
            System.out.println("1");
        }else if(a <20){
            System.out.println("2");
        }else if(a <30){
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }

}
