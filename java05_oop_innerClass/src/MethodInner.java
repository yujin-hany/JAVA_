
public class MethodInner {
 
	String email="goguma777@nate.com";
	
	//������ �޽��
	MethodInner() {}
	
	//�Ϲ� �޽��
	public void createInner() {
		//InnerTest it=new InnerTest(); => ������ (���� �޽�� ����Ǿ����)
		// ���� Ŭ���� : ��ü�� �����Ͽ� ����ؾ� ��
		
		//��������
		String addr="����� �������� ���ǵ���";
		
		
		class InnerTest{
			int num=5555;
			String userid="abcd";
			
			//������ �޽��
			InnerTest() {}
			
			//�׳� �Ϲ� �޽�� with no ���
			void getInformaiton () {
				System.out.println("��ȣ="+num);
				System.out.println("���̵�="+userid);
				System.out.println("�̸���="+email);
				System.out.println("�ּ�="+addr);
			}
			
		}
		
		InnerTest it=new InnerTest();
		it.getInformaiton();
	}
	
	

	
	
	public static void main(String[] args) {
		//�޽�� ���� ���� Ŭ������ �ٸ� Ŭ�������� ���Ұ�
		//new MethodInner().new InnerTest();
		new MethodInner().createInner();
		
	}
	

}
