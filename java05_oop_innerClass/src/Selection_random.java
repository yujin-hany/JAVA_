import java.util.Random;
//import java.util.Scanner;

public class Selection_random {

	public static void main(String[] args) {
		Random ran=new Random();
		int arr[]=new int[10];
		
		for (int i=0; i<10; i++) {
			int num=ran.nextInt(1000)+1001; //[ 그냥 1000만 하면 0부터 999]
			arr[i]=num;
			
		}
		
		for (int n: arr) {
			System.out.print(n+",");
			
		}
		System.out.println();
		
		// 이렇게 하면 안됨.
		// selectionsort 의경우 최소와 최대 값의 인덱스를 가져와야 함.
		
		for (int i=0; i<arr.length-1; i++) {
			
			for (int j=i+1; j<arr.length; j++) {
				if ( arr[i]< arr[j]) {
					int temp=arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int n: arr) {
			System.out.print(n+",");
			
		}
		System.out.println();
		}
	}
