import java.util.Scanner;

public class ExceptionTest2 {

	
		public ExceptionTest2() {}
		
		public void start()          {
			//Exception ó�� :software �� ���� �� �� �ִ� ������ ���Ѵ�.
			//1. try~ catch �� �̿�
			//2. �޽�带 �̿��ϴ� ���
			
		try {
			
			// try ��: ���� �߻� �� �� �ִ� �ڵ�� 
			//         ���� �߻� ���ɼ��� ���� �ڵ带 ����Ѵ�.
				Scanner scan=new Scanner(System.in);
				System.out.print("���ڸ� �Է��ض�="); 
				
				// nextInt()�� ����
				int num= Integer.parseInt(scan.nextLine());////
				
				System.out.print("���� �Է�=");
				int num2=scan.nextInt(); ///
				
				
				int result=num/num2;////
				System.out.printf("%d / %d= %d\n", num,num2,result);
				System.out.println("num="+num);
				
				
				int arr[]=new int[5];
				arr[arr.length-1]=100;////
				
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			
			
		} catch(NumberFormatException ne) {
			System.out.println("���ڸ� ���ڷ� �ٲ� �� ����.");
		
		
		
			// �̰� ��� ���ܸ� �޴°Ŷ� ���������� �־����!!! �̰� ���� �ø��� �켱������ �Ǳ� ������
			// �ٸ� exception ���� �������� �Ұ�����.
		}catch(Exception e) {//!!! ��� ���� Ŭ������ ����=> ��� ���ܸ� ������ �� �ִ�.!!!
			e.printStackTrace();
			
			
			
			
		} finally { 
				// ���� �߻� ���ο� ������� �����.
			System.out.println("finallly ����...");
			try {
				
				
				
			}catch(Exception e) {}
		  //�̷��� finally �ȿ��� ���� ó�� �����ϴ�
		
		}		
		}		

		//}
	public static void main(String[] args) {
		new ExceptionTest2().start();

	}
	

}






