import java.util.Random;
//import java.util.Scanner;

public class Selection_random {

	public static void main(String[] args) {
		Random ran=new Random();
		int arr[]=new int[10];
		
		for (int i=0; i<10; i++) {
			int num=ran.nextInt(1000)+1001; //[ �׳� 1000�� �ϸ� 0���� 999]
			arr[i]=num;
			
		}
		
		for (int n: arr) {
			System.out.print(n+",");
			
		}
		System.out.println();
		
		// �̷��� �ϸ� �ȵ�.
		// selectionsort �ǰ�� �ּҿ� �ִ� ���� �ε����� �����;� ��.
		
		for (int i=0; i<arr.length-1; i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				if ( arr[i]< arr[j]) {
					int temp=arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("���� ��");
		for (int n: arr) {
			System.out.print(n+",");
			
		}
		System.out.println();
		}
	}
