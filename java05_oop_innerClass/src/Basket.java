

import java.util.Scanner;
public class Basket {

	public static void main(String[] args) {
		// ��� �ٱ��� �����
		
		Scanner scan=new Scanner(System.in);
		System.out.println("����� ��=");
		int apple=scan.nextInt();
		int basket= (apple%10==0)? apple/10 : apple/10+1;
		System.out.println("�ʿ��� �ٱ����� ��" +basket);
	

	}

}
