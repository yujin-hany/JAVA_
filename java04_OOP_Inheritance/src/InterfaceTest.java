

// �������̽��� �߻�޽�带 ǥ���ϴ� ���̴�.
// �Ϲ� �޽��� ���� �� �� ������, ���⿡ ��� �� �� �ִ� ���� �߻� �޽�� Ȥ�� static final �޽�� �̴�.

public interface InterfaceTest {
	
	//static final ����
	public static final int CODE=1234;  
	public static final String ADMIN_ID="master";  
	
	
	// �߻�޽�� => �������̽������� �޽��� �����.
	public void add(int a, int  b); 
	public void minus(int a, int b);
	
	
	// �׷� �̰� ��� ���?
	//���� abstract class ��ӹ��� Ŭ����[extends]���� overriding �ؼ� ��ü �����Ͽ� �����.  
	//�ٵ� �̰� interface�� (class �� �ƴ�) 
	// �⺻������ Ŭ�������� �������̽��� ��ӹ���.��, ��ӹ޴� Ű����� implement��
	// �������̽��� ������ ���� �� ���� (����� Ŭ���� �ϳ��� extend�� ���� �� ����)
	// 
	
	
}
