
public class InterfaceMain   implements InterfaceTest, InterfaceA{
    // Ŭ������ �������̽� ���ÿ� ��� �ޱ� : ������
	// Ŭ���� ���� ��ӹް� �������̽� �޴� ����.
	// �ٵ� �̰� �ϸ� �������̽����� ���� �߻�޽�带 �� overriding ���־�� ��. (������~)
	//�������̽����� ��ӹ��� �� ���� ( extends ���,�� �������̽��� �ϳ��� �������̽��� ��� ���� �� ����)
	// Ŭ������ �������̽� ���� ������ ������ ����, implements ���
	
	
	
	
	// overriding �ϱ�
	public  void add(int n1,int n2) {  //n1,n2�� �ƴ϶� a,b���� ��.
		System.out.println(n1+n2);
	}
	
	public  void minus(int n1,int n2) {
		System.out.println(n1-n2);
	}
	
	public int getData() { 
		return 9999;
	}     // 
	// ���� �߻�޽�忡���� void���µ� ���⼭ int �� �ٲٸ� overriding�� �ƴ϶� �׳� ���� �޽�� �����ΰ�
	// ���� ������ �ϸ�.
	// int�� ������ ���� �����־�� ��.
	
	
	// multiple �߻��� �޽��� �׳� ���๮ ���� ä�� overriding ����
	// InterfaceA�� InterfaceB�� ��ӹ޾ұ⿡ InterfaceA�� �ҷ��� �ڵ����� �� �ҷ�����
	public void multiple(int n1,int n2) {
		System.out.println(n1*n2);
	}
	
	
	
	
	//public static void main(String[] args) {
	//	InterfaceMain im= new InterfaceMain();
	//	im.add(10, 15);
		

//	}

}
