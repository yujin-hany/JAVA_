import java.util.Scanner;
public class Random3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ��=");
		int num=Integer.parseInt(scan.nextLine());
		 
		int sum=0; int sum_even=0; int sum_odd=0;
		
		for (int i=0; i<=num; i++) {
			if (i%2==0) {
				sum_even+=i;
			}
			if (i%2!=0) {
				sum_odd+=i;
			}
			if (i%3==0) {
				sum+=i;
			}
		}
		System.out.println("������ ��"+num);
		System.out.println("¦���� ��"+sum_even);
		System.out.println("Ȧ���� ��"+sum_odd);
		System.out.println("3�� ����� ��"+ sum);
	}

}
