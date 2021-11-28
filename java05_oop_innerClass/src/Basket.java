

import java.util.Scanner;
public class Basket {

	public static void main(String[] args) {
		// 사과 바구니 만들기
		
		Scanner scan=new Scanner(System.in);
		System.out.println("사과의 수=");
		int apple=scan.nextInt();
		int basket= (apple%10==0)? apple/10 : apple/10+1;
		System.out.println("필요한 바구니의 수" +basket);
	

	}

}
