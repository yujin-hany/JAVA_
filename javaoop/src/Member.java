
public class Member {

	int sabun;
	String name;
	
	static String position;
	
	// ������ �޽��
	Member () {
		
	}
	Member ( int sabun, String name, String positsion){
		this.sabun=sabun;
		this.name=name;
		this.position= position; //���� ��Ű�� �������� member.position ������. �ֳĸ� static�̶� ��ü���� �ʿ� ����.
}
	void memberOutput() {
		System.out.printf("%8d %8s %8s", sabun, name,position);
		
	}
	
	void data() {
		//static String email; //���������� ��� data() ���� �ȵǸ� email ��ü ��������� �ʾƼ� �������������� static ��� �Ұ��� (��ü ������)
		
	}
	
	public static void main (String[] a) {
		System.out.println(Member.position);  // => ����� null since �����͸� ���� ���� ��� �׳� �ʱⰪ��.
		//�� ���������� static�� �ǹ̰� ���� �ֳĸ� �̰� �׳� ������ ������� �ִϱ�
		
		Member m1=new Member();
		Member m2=new Member(5, "ȫ","����");
		Member m3=new Member(200, "��","����");
		m1.position="����";		
		m2.memberOutput();  // m1.position �� ���� ���� position���� ����(����)
		
		System.out.println(Member.position);  //static���� �׳� Ŭ����.position �����ϰ� �������� ����
		// static position �� ���� 1���� �׳� ���������� ���� ��.
		//sabun=500; // �̰� ������ �ֳĸ� ��ü �ȸ���� ���� ��.
		//position="����"; // static�̶� ��ü �ȸ���� ��� ���� +���� Ŭ���� �� ����
		
		
	}
}
