
public class loop2 {

	public static void main(String[] args) {
		
//		for(int a=0; a <100; a++) {
//			System.out.println(a+"번쨰");
//			System.out.println(a+1);
//		}
//		int sum =0;
//		for(int i = 0;i < 100;i++) {
//			sum = sum + (i+1);
//		}
//		System.out.println(sum);
		
//		int sum0 = 0;
//		for(int i=0; i <1000;i++) {
//			sum0 = sum0+(i+1);
//			
//		}
//		System.out.println(sum0);
//	
	int sum1 = 0;
	for(int i = 0;i<100;i++) {
		int num1 = i+1;
		if(num1 % 2 ==0) {
			sum1 = sum1 +num1;
		}
			
	}
		System.out.println(sum1);
	}
}