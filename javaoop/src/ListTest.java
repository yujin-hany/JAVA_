
//import java.util.*; �̷��� �ϑm�� util �� ��� �޽�� �������� �ǵ� �޸� ���� �����ͼ� ������..
// Ķ����, ����, ��ĳ�� ��� util �� ����
// ��� ������ �ƹ��͵� ������ �ڵ�����  �ش� Ŭ���� ������ .class �������
// bin�� �ִ°� default package�� package �ʿ� ����
// sawon��Ű���� member ��Ű�� ���� ������ package sawon.member�� ���� �ؾ���.


import java.util.Scanner; 
import java.util.Random;
import java.util.Calendar;

// main �� ��� ����� �� ���� ����. �������� ���� �Ͱ� ����.
//������ �޽�� ������ŭ ��ü ���� �� ����.
//���⿡ �ִ� ���� �� �ϳ��� Ÿ Ŭ���� ���Ͽ��� ���� ������ ���Ⲩ �̸����� ��ü ������ ��.
public class ListTest {
   // ��� ���� (Field ����)
	// ���ܹ��� ���⿡���� ��� �Ұ��ϳ� static{}  ���� ��� �����ϸ�
	// static �� {} �ϸ� �����ѵ� Ÿ Ŭ�������� ���� Ŭ���� ��ü ���� ��
	// static�� �ִ� ��ɹ��� ���� ���� �����!!!
	
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
	//������ �޽��� ��ü ���� �� �ѹ� �����. ( �ٽ� ������� ����)
	
	ListTest() { //�̰� ������ �޽��
		System.out.println("why ?");
	}
	
	ListTest(String n) {
		System.out.println(n+"ClassTest()...........");
		
	}
	
	ListTest(int n) {
		System.out.println(n+"ClassTest()...........");
		
	}
	
	ListTest(int n,String name) { // �Ʒ��� ������ �ٸ�.
		
		System.out.println(name+"Please don't take test..."+n);
	}
	
	ListTest(String name,int n) {
		
		System.out.println(name+"Please don't take test..."+n);
	}
	
	//����� �޽�带 ���� => ������ �޽�� �ؿ� ���� ����
	// ���� �ٲ� ����� ������ �̰� �Ϲ����� ��: ����=> ������=>����� �޽��
	// �޽��: �ϳ��� �۾� ����
	// 
	// ���� ������ : public , private �̷��ǵ� �̷��� ���߿� �����ϽŴٰ� ��.
	//���� ������ ��ȯ��: void => �޼ҵ��� �������� ���ƿ��� ���� ����.
	// return �� ���� void �ڸ��� int/Calendar/String/Scanner �� ��ü Ŭ������ ������Ÿ���� ���ֱ�
	// ����� �޽�� ==> ���� ������. �̰� ��ü�� �����!!
	// �޽�� ���� ������ �ҹ��ڷ� ����, �ռ����� ��� �ι�° �ܾ���� ù ���ڸ� �빮�ڷ� �Ѵ�
	
	
	public void sum() {  // ����� �޽�� �̸��� sum
		int tot=0;
		for (int i=1; i<=100; i++) {
			tot+=i; 
		}
		System.out.println("����="+tot);
		
		
		System.out.println("total=>"+total(200)); // sum() �޽�� �θ��� ���� �ȿ� �ִ� total() �޽�带 �������.
		 // ���๮ �� ��ü����� ��� �츮�� ����� �� ���⿡ ���� ��
		//main method �� ��� �� ���⿡ ���� �ǵ� �۾� ������ ���⿡ ����� ����
	}
	
	public int total(int max) {  //total �̶�� �޽�� ȣ�� �� ���� �ϳ� �־��־�� ��.
		int sum=0;   // int max�� ����������.
		for ( int i=1; i<=max; i++) { // ȣ���� ��ü��.total(50);
			sum+=i;
			
		}
		return sum;  // ������ ���� ���� ���⿡�� ��!!  �̰� �Ⱦ��� ������.
		// ������ �ΰ� �̻� �ؾ� �ϸ� array �� ���µ� �ڷ����� �ٸ��� collection �̶�� Ŭ������ ���߿� ����� ��
	}
}
