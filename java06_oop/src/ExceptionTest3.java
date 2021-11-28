import java.util.Scanner;
import java.util.InputMismatchException;
//2> �޽�� ������ ����ó��
public class ExceptionTest3 {
	Scanner scan=new Scanner(System.in);
	
	public ExceptionTest3() {}
	
	public void method1() throws ArrayIndexOutOfBoundsException, ArithmeticException,InputMismatchException {
		int num=scan.nextInt(); // InputMismatchException ���� �� ����
		int num2=scan.nextInt();// InputMismatchException ���� �� ����
		method2( num, num2);  //�׷��� ����� ������ �� 2)
	}
	
	public void method2(int num, int num2) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int result=num/num2; //��Ÿ�ӿ����� ���� �� 0���� ������ ������. : arithmeticException 
		System.out.printf("%d / %d = %d\n", num,num2,result);
		method3(num);//�׷��� ����� ������ �� 1>
		
		
	}
	// ���⼭ ���� ����ϱ� ���⼭ ���� ó�� �غ���!
	public void method3(int num) throws ArrayIndexOutOfBoundsException{
		int arr[]=new int[num];
		arr[num]=562; //���⼭ length-1�̾�� ���� �ȳ�( arryindexouoftbounderror)
	}//�׷��� ����� ������ �� 0>
	
	
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException,InputMismatchException{
		//�׷��� ����� ������ �� 4>
		//=> ���� å�������ϴ� ����
	//=> ���θ޽��� ���� å�� ������ �ְ� ����
		
		ExceptionTest3 t=new ExceptionTest3();
		try {
		t.method1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ���� �߻�");
		}catch(ArithmeticException ae) {
			System.out.println("0���� ������ �ȵ�!");
		}catch(InputMismatchException ie) {
			System.out.println("������ �Է��ϼ���...");
		}
		

	}

}
