
public class AnonymousInner {

	
	public AnonymousInner() {}
	
	public void start() {
		//�͸��� ���� Ŭ����: Ŭ�������� �������� �ʴ� Ŭ����
		
		
		// ���� �̷��� �ؼ� sam���� sam  ���� ����� �����.
		Sample sam= new Sample(); // ��ü �����ϴ� ��
		
		//!! ���ο� Ŭ�����ϱ� �̷��� �ؼ� ���� �ȹް� ��.!!
		new Sample() {
			//�ʿ��� ��� �߰� �� overriding ���
			// sum() �� sample�� �ִµ� �̰� overriding��.
			public void sum(){ 
				int i=0;
				for (int j=1; j<100; j+=2) {
					i+=j;
				}
				System.out.println("i="+i);
			}
			//���� Ŭ������ ���� �޽�� �����
			
			//sample()�� ���µ� sample�� ���������� ������ �ȳ�.
			 public void output() {
				 System.out.println("���� �߰��� �޽��");
			 }
		
		}.output();   //.sum();
		sam.sum();
		//sam.output() ; // ���⿡�� output�� ����. => �͸��� ���� Ŭ������ ���⿡�� �ѹ��� �����ϰ�
		// �ٸ� ������ �� �� ���� �� �����.
	}
	public static void main(String[] args) {
		new AnonymousInner().start();
		
		
	}

}
