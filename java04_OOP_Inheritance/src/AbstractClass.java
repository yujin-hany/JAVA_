/// �߻� Ŭ������ �߻� �޽�带 1�� �̻� �����ϰ� �ִ� �޽��
// �߻� �޽��� �޽���� ��ȯ�� �������� ���๮�� ���� �޽�带 �ǹ��Ѵ�.
// �߻� Ŭ������ ��ü ������ �Ұ����ϸ� �ݵ�� ����� �޾Ƽ� overriding ���־�� ��.

public abstract class AbstractClass {
	int data=200;
	
	// ������ �޽��
	public AbstractClass() {}
	
	//�� : �߻�޽��� ���� => ��ȯ�� ���ʿ� abstract �̶�� �־�� ��.!!
	//: public ����Ÿ�� �޽���(�Ű�����) : 
	public abstract int add(int n1,int n2);
		
		
	
	
	//��
	  public void minus(int n1, int n2) {
		  int result=n1-n2;
		  output(n1,n2,result, "-");
		 // System.out.printf("%d-%d=%d",n1,n2,result);
	  }
	  
	//��
	 public abstract void multiple(int n1, int n2);
	  
	  
	//��
	  public void divide(int n1,int n2) {
		  int result=n1/n2;
		  output(n1,n2,result,"/");
		
	  }
	  
	  //��¹��� �޽�带 ���� �ݺ��� ��������
	  public void output(int n1,int n2, int result,String operator) {
		  System.out.printf("%d %s %d=%d",n1,operator,n2,result);
	  }
	  
	  
}
	
	
	
	


