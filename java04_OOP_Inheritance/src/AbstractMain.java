

//�߻� Ŭ���� ��� ������ ��� �߻� �޽��� ���� Ŭ�������� ������ �Ǿ�� ��[overriding]
//���� ���� ���� overriding �Ǿ� ���� �ʱ� ����
public class AbstractMain extends AbstractClass {
	
	  // Ŭ���� �ؿ� �ٷ� �ؾ� ��.
	//add �߻� �޽�� overriding �ϱ�  : �������� abstract �� ����
	public int add(int a, int b) {  //�Ű����� �� �����ص� ��.
		int result=a+b;
		return result;
		
	}
	
	// �߻� Ŭ���� �������̵� with no ���๮ : �̰͵� �������̵� �Ѱ���
	// ��ɱ����� �� ��� �߻�Ŭ���� {} ���־�� ��.
	public void multiple(int a,int b) {
		// ���๮
		
	}
	
	
	
	//�߻� �޽�常 ��� �� ���� ����!!  :���� �� �̸� �޽��� ���Ͻ��ѵΰ� ���߿� ��� �߰��ϴ� �� ���� ��.
	//=> interface: �߻� �޽�常 ��Ƶ� !!Ŭ����!! �ǹ���. (���⼭ �Ϲ� �޽�� ���� ������)
	// Ŭ������ ���� Ű���� ��� interface interfaceename �� ��.
	//=> �ٵ� �� Ŭ������� �ϳ�? �������ϸ� .class ������ ���ܼ� �׳� Ŭ������� ��.(interfacename.class�� ������)
	// �Ϲ� �޽�� ��� �� ����
	//�߻� �޽�� �� �� �� �ִ°� public  final static ������Ÿ�� ������=500; �̰� ������.
	// final : ���� �Ұ� (MATH.PI�� ���� �� �빮�ڷ� ��������� �͵�� �ѹ� �Ҿ���� ���� �Ұ�����, �ҹ��ڷ� �ᵵ ������ �ȳ��ٰ� ��.)
	//static: jvm���� ����ϴ� �ش� �������� �� 1�� ���� 
	// public: ��𼭳� ���� ������.

	
	
	

	public static void main(String[] args) {
	
		AbstractMain am=new AbstractMain(); // ��ü �����ϱ�
	
		// �޽�� ȣ���ϱ�
		am.minus(300,49);
		 
		System.out.println("am.add(189,981)->"+am.add(189, 981)); // �̰� ���ϵǴ°Ŷ�
		
		// �߻� Ŭ���� ��ü �����ϱ�
		// AbstractClass at=new AbstractClass();  //�߻�޽�� �ִ� Ŭ������ ��ü ����
		// �߻� �޽��� �̿ϼ��̶� ��ü ������ �� ����. => ��ӹ޾Ƽ� �������̵� �ؾ� ��ü ���� ����
		// new �� ������°� calendar �� ������.

		
		
	}

}
