
public class Java3_If {

	public static void main(String[] args) {
//		int a = 10; //⚠️선언만 하고 사용을안함
//		if (a == 9) {
//			System.out.println("a==10");
//		}
//		//
//		if (a > 10) {
//			System.out.println("a>10");
//		}else {
//			System.out.println("a<=10");
//		}
//		//
//		if(a < 5) {
//			System.out.println("a<5");
//		}else if (a == 5) {
//			System.out.println("a>=5");
//		}else {
//			System.out.println("안맞음");
//		}
		//<=작거나같다 <작다 >=크거나같다 >크다
		
		for(int i = 1; i<10; i++) {
			if(i<=10) {
			System.out.println("2*" + i +"=" + (2*i));
			}else {
				System.out.println("no");
			}
		}
		

	}

}
