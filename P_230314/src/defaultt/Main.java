package defaultt;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int randomValue = r.nextInt(100)+1; //r.nextInt();(랜덤숫자 출력) randomValue이라는 변수에 담기
        System.out.println("랜덤숫자는" + randomValue+"입니다");
        System.out.println("나머지값은 :" +(randomValue % 2));//연산자 우선순위 (randomValue % 2) //<"*"나 "/"부터 괄호 쳐도 상관없음



        double d = r.nextDouble();
        System.out.println(d);

        int number2 = r.nextInt(26) + 65;
        System.out.println(number2);
        char c = (char) number2;
        System.out.println(c); //아스키코드 강제 형변환



    }

}
