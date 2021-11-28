import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	// ������ �޽��
	public  ExceptionTest() {}
	
	
	public void start() {
		//Exception ó�� :software �� ���� �� �� �ִ� ������ ���Ѵ�.
		//1. try~ catch �� �̿�
		//2. �޽�带 �̿��ϴ� ���
		
	try {
		
		// try ��: ���� �߻� �� �� �ִ� �ڵ�� 
		//         ���� �߻� ���ɼ��� ���� �ڵ带 ����Ѵ�.
			Scanner scan=new Scanner(System.in);
			System.out.print("���ڸ� �Է��ض�=");
			
			// nextInt()�� ����
			int num= scan.nextInt();
			
			System.out.print("���� �Է�=");
			int num2=scan.nextInt();
			
			
			int result=num/num2;
			System.out.printf("%d / %d= %d\n", num,num2,result);
			System.out.println("num="+num);
			
			
			int arr[]=new int[5];
			arr[arr.length ]=100; // 
			
			
	   } catch (InputMismatchException ime) {  //ime�� �� ������ ���� ������� ���� ����.
		   // ���ܰ� �߻��ϸ� ����Ǵ� ���� (���� �߻� ���ϸ� ���� ���� �ȵ�.)
	    	System.out.println("���ڸ� �Է��� �� �����ϴ�.");
	    	
	    	
	    	//�̰� return �� string
	    	//getMessage();
	    	System.out.println(ime.getMessage()); //=> null�� ����
	    	
	    	
	    	// printStackTrace(); : 
	    	//return �� ������ ���� ó�� ���̶� ��� ����
	    	ime.printStackTrace();
	    	
	    	
	   } catch(ArithmeticException ae) {
		   System.out.println("0���δ� ���� �� �����ϴ�");
		   System.out.println(ae.getMessage());
		   
		   ae.printStackTrace();
	   
	
		} catch(ArrayIndexOutOfBoundsException aa) {
		System.out.println("�ε��� �ʰ��Դϴ�.");
		System.out.println(aa.getMessage());
		aa.printStackTrace();
	}
	    	
	    
	
		//System.out.println("Thee end,,,,");  //���� �߻����ο� ������� ���� ���İ� (������ ������ �� ���� ��ħ)
	}

	public static void main(String[] args) {
		new ExceptionTest().start();
	}

}







