
//���� Ŭ���� : Ŭ���� �� Ŭ������ �����Ͽ� ��ġ ��ӹ��� �� ó�� ����Ѵ�. <= �������� ���� Ŭ������ ���� �� ����.
// 1>��� ������ ���� Ŭ����
// 2> �޽�� ���� ���� Ŭ����
// 3> �͸�(anonymous)�� ���� Ŭ����


// �̰� ��� ������ ���� Ŭ����
public class Outer {
	int num=1234;
	
	String name="ȫ�浿";
	Inner inner =new Inner();
	
	//������ �޽��
	public Outer() {
		System.out.println("Outer()....");
	}

	// �׳� �޽��
	public void output() {
		System.out.println("��ȣ="+num);
		System.out.println("�̸�"+name);
		//System.out.println("��ȭ��ȣ"+tel);
		
		//�ܺ�Ŭ�������� ���� Ŭ������ ��������� ���� �� �� ����.
	}
	
	public void createInner() {
		Inner inner=new Inner(); //����������. 
		System.out.println("inner.num--> "+inner.num); //�̷��� �ؾ� �ܺο��� ���� ���� ������
		inner.getMember();
		
		
	}
	

	//���� Ŭ����
	class Inner {
		//���� ���� ����
		int num=5678;
		String tel="010-4799-9356";
		
		//������ �޽��
		Inner () {
			System.out.println("Inner()....");
			
			
		}
		
		void getMember() {
			System.out.println("num="+num+", tel="+tel+" name="+name);
			// ���� Ŭ������ �ܺ� Ŭ������ ��� ��������� ���� �� �� �ִ�.
			//System.out.println(Outer.num);
			
			
			//���ο� �ܺο� ���� �̸��� ���� ������ ���ο��� �ܺ��� ���� �̸� ���� super �����ε� ���� �Ұ�
		}
	}
	
	public static void main (String a[]) {
		
		Outer outer=new Outer();
		outer.output();  //���� Ŭ���� ������ ������� �ܺ� Ŭ������ �׳� ��� ���� �� �� ����.
		
		// ���� Ŭ���� ����Ϸ��� �ܺ� Ŭ���� �־�� ��.
		//���� Ŭ���� ��ü �����ϱ� : !!!�ܺ� Ŭ���� ��ü�� ����� ���� ���� Ŭ���� ��ü ������ �� !!!
		
		Outer.Inner i=new Outer().new Inner();	
		Outer.Inner ii  =outer.new Inner(); // �ܺ� ��ü��.new Inner();
		
		i.getMember();
		ii.getMember();
		
		outer.createInner();
	}
	
}
