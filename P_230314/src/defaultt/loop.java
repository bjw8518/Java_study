package defaultt;


public class loop {

    public static void main(String[] args) {

//		for(int a=0; a <100; a++) {
//			System.out.println(a+"번쨰");
//			System.out.println(a+1);
//		}
        int sumsum =0;
        for(int i = 0;i < 100;i++) {
            sumsum = sumsum + (i+1);
            System.out.println(sumsum);
        }
        System.out.println(sumsum);


    }
}
