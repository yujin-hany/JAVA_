
import java.util.Scanner;
import java.util.InputMismatchException;
//�ݵ�� 1~100 ������ ���� �Է¹޾� �Է¹��� �������� ���� ���ض�
public class MyException1125_Main {

	Scanner scan=new Scanner(System.in);
	MyException1125_Main() {}
	
	
	//�� ���ϱ�
	public void sum(int max) {
		int total=0;
		for (int i=1; i<=max; i++) {
			total+=i;
		}
		System.out.println("1~"+max+"������ ����"+total);
	}
	
	public void start() {
	 try {
		 System.out.print("1-100 ������ ����=");
		 int max=scan.nextInt();
		 
		 if (max>=1 && max<=100) {
			 sum(max);
			 
			 // 1�� 100 ������ ���� �ƴ�
		 }else {
			  // !!!���ܸ� ������ �߻����Ѿ� ��!!!
			 throw new MyException1125("�Է°��� 1~100������ ���� �����Ϳ��� �մϴ�."); //�޽����� �ٲ�� ��Ȳ
			 // myException �̶�� ���ܰ� ������ �߻���/
			 //==> �̰� ���� catch ���� �ʿ���.
			 
		 }
		 
	 }catch(InputMismatchException ime) { 
		 System.out.println("���ڸ� �Է��ؾ� �մϴ�.");
		 
	 }catch(MyException1125 me) {
		 System.out.println(me.getMessage());
	 }
	}

	public static void main(String[] args) {
		MyException1125_Main mt=new MyException1125_Main();
		mt.start();

	}

}
