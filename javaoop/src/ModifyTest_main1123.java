
 import sawon.pub_1123;
public class ModifyTest_main1123 {

	// ������ �޽��
	public ModifyTest_main1123 () {}
	public void start() {
		//default: ���� ��Ű�� �� Ŭ���������� ������ ������ ����Ѵ�.
		ModifyTest_1123 mt=new ModifyTest_1123(); //��ü ������.
		
		
		// ���� �����ڰ� default ������ ��� �Ұ���.=> ��� ���� ����
		pub_1123 lt=new pub_1123(); 
		// <= �̰� �ٸ� defualt ��Ű���� ��ü ���� �Ұ��ؼ� ������.
		// �ƿ� �ش� ������ �޽�� ã�� ���� ����. (���� �ִ� ��� �׳� ����)
		// class default �ؼ� �ȵż� Ǯ���µ��� �ȵ�.=> �ֳĸ� ��ü ���� �ÿ��� ������ �޽��� default ��
		// ==> ������ �޽�忡 public �ٿ��� �ȵ�.
		// => ��� ��Ű������ �������� ���� import �ʿ���. => �̰� ���� �ϸ� ���� ���� �ȳ�.
		
		
		
		//��ü ���� ���� �����ϱ�
		System.out.println("mt.num->"+mt.num);  //���� ��Ű�� �� default�� ����
		///System.out.println("lt.name->"+lt.name); //��� �Ұ��� since ���������� ���� �����ڰ� default
		
		
		//�޽�� ȣ��
		mt.numPrint();  //ȣ�� ���� 
		lt.namePrint(); // not visible�̶�� ��. 
		// �� �޽��� �ٸ� ��Ű���� Ŭ������ ���� �Ұ��� : �޽���� ���������ڰ� default
		// => ����ϰ� �Ϸ��� public �̶�� �տ� ���� ������ ���־�� ��.
		
		
		// private�� Ŭ���� �ܺο��� ��ü�� ���Ͽ� �����ϱ� �Ұ���
		//System.out.print("tel="+mt.tel); // �̰� private�̶� �Ұ�����.==ĸ��ȭ
		
		
		//System.out.println("addr"+lt.addr); // private�� ��Ű�� �ٸ�.=> ���� �Ұ���
		
		
		//lt.addrOutput(); // �Ұ����� since �̰� private�̶� �ܺο��� ���� �Ұ�����.
		
		
		//ModifyTest_1123 mt2=new ModifyTest_1123("010-4799-9356"); // ������ �޽�带 ����ϰ� �ִ� Ŭ������
		//������ �޽�尡 �ִ� Ŭ������ Ŭ������ �ٸ�.=> private�� ���� �Ұ���
		//=> ��ü������� �տ��� �� ModifyTest_1123() ���� �ؾ���.
		
		System.out.println(ModifyTest_1123.num);  //static�� �ٿ��� ��ü���� �ƴ϶� �׳� Ŭ����������
		ModifyTest_1123.numPrint();  //static�� new�� ��ü �ȸ��� ���� �ְ� ����.
		
	}
	public static void main(String[] args) {
		new ModifyTest_main1123().start();

	}
	

	
	
	
	
	

}
