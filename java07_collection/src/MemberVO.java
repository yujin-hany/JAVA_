
public class MemberVO {
	//������ ���� ����
	
	// ���� ���� FOR DATA STORAGE
	//��ü�� ���� �������� ���ϰ� ���������� ���
	private int num;
	private String userName;
	private String tel;
	
	
	
	// �Ű����� ���� �Ͱ� �Ű����� �ִ� �����ڸ� �����
	// �ֳĸ� �̰� ���ϸ� ������ 20���� getter/setter �� 40�� �ʿ���
	
	public MemberVO() {}
	public MemberVO(int num,String userName, String tel) {
		this.num=num;
		this.userName=userName;
		this.tel=tel;
	}
	
	
	// ��Ģ ���Ѽ� ������
	
	// SETTER: ������ ���� �� set+���� �������� �ձ��ڸ� �빮�ڷ� => ��ȣ�� �������ִ� �޽��
	public void setNum(int num) {
		this.num=num;
		
	}
	
	//GETTER: ��ȣ�� �ܺη� ������ �� �ְ� ���ִ� �޽��
	public int getNum() {
		return num;
		
	}
	public void setUserName(String userName) {
		this.userName=userName;
		
	}
	public String getUserName() {
		return userName;
		
	}
	public void setTel(String tel) {
		this.tel=tel;
		
	}
	
	//GETTER: ��ȣ�� �ܺη� ������ �� �ְ� ���ִ� �޽��
	public String getTel() {
		return tel;
		
	}
	
	
	
	
	// ȸ�� ������ ���ڿ��� ����� �����ϴ� �޽�� �����ϱ�
	//=> toString �� Array.toString �� �� �ẽ
	// �̰� toString �̶�� �޽�尡 object�� �ִµ� ���⼭ ������ �̸����� ������ : overriding 
	public String toString() {
		String result=num+"\t"+userName+"\t"+tel;
		return result;
		
	}
	
	
	
	
	
	
	
	
	
}
