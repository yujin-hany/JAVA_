
public class Polymorphism {

	public static void main(String[] args) {
		
		
		// ��ü ���� Ÿ���� object��
		Car c=new Car() ; // ���� Ŭ���� ��ü/�ڽ��� Ŭ���� ��ü�� ���� �� ����.
		
		
		// ���� �ƴ�.. ��??
		//��Ӱ��� ������. :��� Ŭ������ object�� ���� �ֻ�� Ŭ������ ������ ����.
		//=> ���� Ŭ���� ��ü�� ���� Ŭ���� ��ü�� �����ϸ� �ڵ����� ����ȯ�� �ȴ�.
		Object o=new Car();  
		
		c.speedUp();
		
		// o.speedUp() ; // ������.speedUp() �� Car �� �ִ� ������ Object�� �ִ� ���� �ƴ�
		
		
		//�� ��ȯ
		//Car c2=o;  // ������
		// Car�� ��ü�� ���� ���� Ŭ�������� ���� ���� �ڵ����� �� ��.
		//�ٵ� Car�� ����� object������ �����ϱ� �ٽ� �� ��ȯ�� �ؼ� 
		// ���� Ŭ���� Ÿ���� ���� Ŭ���� Ÿ������ ��ȯ�ϴ� ��
		//  ==> �ڵ��� �ƴ϶� ������ �� ��ȯ ���Ѿ� ��.
		
		Car c2=(Car)o;  // => �� ��ȯ ��Ű�� ����.
		c2.speedUp(); //���� ��ȯ�ϴϱ� ����
		
		
		
		
		
		//sedan s=new Car() ;
		//�̰� �ȵ�.
		// ���� Ŭ���� ��ü�� ���� Ŭ���� ��ü�� �����ϴ� ������ �̰� �Ұ���
		// ���ʿ� �ִ� ���� ����Ŭ����������.
		
		
		
		
		// Interface �� ����ȯ
		InterfaceMain m=new InterfaceMain(); // InterfaceMain���� �������̽� 2�� ��ӹ޾Ƽ� overriding �ص�.
		InterfaceTest t=new InterfaceMain();
		InterfaceA a=new InterfaceMain();
		InterfaceB b=new InterfaceMain();
		Object obj=new InterfaceMain();
		
		
		t.add(10,20);
		System.out.println(a.getData()); // �̰� �ۿ� ������ �޽�� ����
		b.multiple(10,20); // empty ���๮�� �ȿ� ������ �ƹ��͵� �ȳ��ͼ� �̰� ������.
		
		
		 InterfaceMain im= (InterfaceMain) a; // a ��ü�� IntefaceMain ���� �� ��ȯ�ؼ� im���� ����
		im.minus(600,300);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
