
public class ClassTestMain_1122 {

	public static void main(String[] args) {
		
		//������ �޼ҵ��� ������ŭ ��ü�� Ÿ Ŭ�������� ����������.
		//������ �޼ҵ�� ��ü ���� �� �ѹ� �����
		//��ü �ȸ���� ���� ��ü�� �ȵ�
		//
		//��ü ������ static�� ������ �޼ҵ庸�� �� ���� ����. => heap�� ��ϵ�
		ListTest lt=new ListTest(100, "ȫ�⵿"); // => ���� ����Ʈ ��� ����Ʈ ��.
		System.out.println(lt); //=> �ּ���.
		
		ListTest lte=new ListTest("ȫ�⵿",100);
		System.out.println(lte);
		
		//�޼ҵ� ȣ�� : ��ü.�޼ҵ��()
		lt.sum(); //�̰� �ٷ� �� ����.
		 // �̰� �ϸ� �ڵ����� total() �� ����
		// ������ ����Ʈ�϶���ߴ� �� ����=>�� ������ total=>�ش� �� ����
		// �̰� ������ �ȹ޾Ƶ� �׳� ����.
		
		
		int result=lt.total(50); 
		
		// return ��. => result�� �ȹ����� �ȳ���!
		System.out.print(result);
		
		
		
		
		
	}

}
// num : call by value/ scan: call by reference
// ������ �޼ҵ�� 