
import java.util.Scanner;


//�޽�� �� �����ؼ� �������� �ʰ� ���� �����ؼ� �� ��
public class Gugudan {
//  �����ܿ� ���õ� ����� ���⿡ ����ڴ� : �̷���...
	CalculatorEx cc= new CalculatorEx(); // ��ü �����=> �̷��� �ϸ� ������ ����ǰ� ��������.
	//�Ϲ� �޽�� : �� �� ���
	void gugudan(int dan) {  //���� ���� �Ϲ� �޽���ӷ� 
		for (int i=2; i<=9; i++) {
			//CalculatorEx cc= new CalculatorEx(); // ��ü �����
			int result=cc.multiple(dan, i); // cc ��ü ���� multiple 
			System.out.printf("%d*%d=%d\n", dan,i,result);
			
		}
		
	}
	
	
	
	void allGugudan() {
		for (int dan=2; dan<=9; dan++) {
			for (int i=2; i<=9; i++) {
				//gugudan �޽�尡 ����� ���ȿ��� cc�� �����ִ� ���̰�
				// gugudan�� allgugudan ���� ���� �Ұ����ϱ⿡ �̷� ��� ��ü ������ ����� �ϴ� ���� �� ����
				System.out.printf("%d*%d=%d\n",dan,i,cc.multiple(dan, i) );   // \n �� �ٹٲٱ��
			}
		}
	}
	
	//�ֿܼ��� ������ �Է¹ް� return ���ִ� �޽��
	int consoleInput(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"=");
		return scan.nextInt();
		
	}
	
	
	
	
		

	}


// ��� ������ ���� ���� :���� ������ ���ϱ� ��
// ������ �޽�� 2�� (�Ű����� ���°� �ϳ�, int ���� �ִ� �� �ϳ�)
// �Ϲ� �޽�� : 1>���� �Ű������� �޾Ƽ� �ش� ���� ����ϴ� �޽��
// 2> ������ 2�ܿ��� 9�ܱ��� �ѹ��� ������ �Ž��
// 3> �ֿܼ��� ���� �Է¹޴� �޽��
//  