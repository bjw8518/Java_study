package defaultt;


public class ExClass2 {

    public static void main(String[] args) {
        int a = 10;

        long b = 1000;

        b = a; //묵시적 형변환(자동)

        a = (int) b; //명시적 형변화 (수동)

        double c = a;//문제없음

        a = (int) c; //소수점자리가 날라감



    }

}