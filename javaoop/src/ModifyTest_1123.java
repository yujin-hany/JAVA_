
public  class ModifyTest_1123 {  //default �� ��.
	
	
	static int num=1234; //���� ��Ű�� ��
	 private String tel="010-4799-9356"; // ���� Ŭ���������� ��� ������.
	 
	 
	 // ������ �޽�� �����
	 ModifyTest_1123() {
		 System.out.println("ModifyTest_1123()");
		 
	 }
	private  ModifyTest_1123(String tel){
		 this.tel=tel;
		 
	 }
	 
	static  void numPrint() {
		 System.out.println("num = "+num);
		 
		 // num ��ü�� �׳� default, ����� static�̸� ������.
		 // static �ƴϸ� ��ü �ȸ����� �����⿡ �������� ��
		 // => ���⼭ num ������ num �� static���� ������ ��
		 
		 
		 // �ʹ� ���� static�� �� ���� ����?
		 // 
	 }
	 

	
}
