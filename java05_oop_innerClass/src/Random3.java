import java.util.Scanner;
public class Random3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("임의의 수=");
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
		System.out.println("임의의 수"+num);
		System.out.println("짝수의 합"+sum_even);
		System.out.println("홀수의 합"+sum_odd);
		System.out.println("3의 배수의 합"+ sum);
	}

}
