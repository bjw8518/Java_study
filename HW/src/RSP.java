import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		System.out.println("가위바위보 게임입니다 \n원하는 숫자를 입력하세요 \n가위:0 바위:1 보:2\n");
		Scanner s = new Scanner(System.in);
		int rsp = s.nextInt();
		
		if(rsp == 0) {
			System.out.println("비김 : 컴퓨터는 가위");
		}else if(rsp == 1) {
			System.out.println("이김 : 컴퓨터는 바위");
		}else if(rsp == 2) {
			System.out.println("짐 : 컴퓨터는 보");
		}
	}
}