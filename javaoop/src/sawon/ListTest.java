package sawon;
// ��Ű��==���� �� ListTest�� �ִ� ������ �̰� ���� package ���ϸ� ������.

import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;


public class ListTest {
   // ��� ���� (Field ����)
	
	int num=100;
	String name;
	
	double data=14.2;
	Scanner scan=new Scanner(System.in);
	
	static {
		// ���๮�� ��� �������� ó���� ��
	System.out.println("����������� �޼ҵ� ȣ��");
	}
	int result=(int) (num+data);
	
	//������ �޽�� :Constructor method
	// �޽����� Ŭ������� �����ϸ� ��ȯ���� ����
	//������ �޽��� ������ ����� ����. (��, �Ű������� ���� : () �� Ȥ�� ������ ���� �޶����.)
	ListTest() { //�̰� ������ �޽��
		System.out.println("ClassTest()...........");
	}
	
	ListTest(String n) {
		System.out.println("Why not?");
		
	}
	
	ListTest(int n,String name) {
		
		System.out.println("Please don't take test...");
	}
	
	
}
