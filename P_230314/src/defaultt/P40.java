package defaultt;

import java.util.Scanner;

public class P40 {

    public static void main(String[] args) {



        for(int i = 0;i<999999999;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력 :");
            System.out.println("종료 : q");

            String in = sc.nextLine();

            if(in.equals("q")) {
                System.out.println("종료됨");
                break;
            }

            int number = Integer.parseInt(in);

            if(number % 2 ==0) {
                System.out.println("짝수입니다");
            }else{
                System.out.println("홀수입니다");
            }
            System.out.println(i+"번째입니다");
        }

    }

}
