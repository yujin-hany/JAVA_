import java.util.Scanner;
public class Change1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("������ ��=");
		int num=Integer.parseInt(scan.nextLine());
		
		int num2=num/10*10+1;
		System.out.println("ó�� ���="+num2);
	}

}
