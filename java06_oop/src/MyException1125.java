
// ����� ���� ����ó�� Ŭ���� �����~
//Exception�� ��ӹޱ�=> Exception ���� Ŭ�����鵵 ���⿡ ����.


public class MyException1125 extends Exception {
	
	
	public MyException1125() {
		//���� Ŭ������ Exception �� ������ �޽�带 ȣ���Ͽ�
		//���� �޽����� �����Ѵ�.
		
		super("1~100������ ���� �ƴϴ�");
	}
	
	
	public MyException1125(String message) {
		super(message);  
	}

}
