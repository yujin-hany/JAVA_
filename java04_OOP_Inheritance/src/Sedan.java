

// �⺻ Ŭ���� �� extends + ��ӹ��� Ŭ������
public class Sedan extends Car {
   //car���� ������ ����� �⺻���� �ʿ��� => car Ŭ���� ��� �ʿ���  : �⺻ Ŭ���� �� extends + ��ӹ��� Ŭ������
	// ����� Ŭ���� ������ ��.
	//�ƹ��͵� ������ ���� �ʾҰ� ������ �޽�嵵 �������� ���� => �ڵ����� �������� ����.
	// ==> ��� �� �Ű����� ���� ������ �����α�
	
	
	
	//���� Ŭ������ �ʵ尪�� 0�ε� ���� �ʱⰪ 50���� ��. 
	int speed=50;
	
	//������ �޽�� ���� ���صθ� �ƹ��͵� �ȳ���?? üũ �ϱ�
	public Sedan() {
		speed=90;
		System.out.println("SEDAN() ������");
	}
	
	
	public Sedan(int speed) {
		super(78);
		this.speed = speed;
		System.out.println("SEDAN(int speed)������ ");
		
	}
	
	
	
	
	
	
	
	public void speedUp() {   //Car�� �ִ� �޽��� �Ȱ��� ����. �ٵ� �� ���⼭ 1�� �ƴ϶� 10�� ������Ű�� ���� : 
		// = ���� Ŭ������ �Ž���� ���� Ŭ������ �Ž�忡�� ������ : �������̵�
		super.speed+=10;
		if (super.speed >250) {
			super.speed=250;
		}	
		System.out.println("SEDAN speedup= "+super.speed);
		// �̰� �ϸ� ���� car�� �Ž���� ����� �̰� ������ �Ŷ�
		// ���� car�� �ִ� ����Ʈ���� �������� ����Ʈ ���� �Ϸ��� �� ��� ��.
	}
	
	
	
	public void start() {
		//Sedan s=new Sedan(); // Sedan Ŭ������ ��ü ����
		//s.speedUp();
		
		
		speedUp();
		speedUp(); //��ü �ȸ���� �̷��Ը��ص� ���� ( CAR �� �ִ°� �� SEDAN���� �ֱ⿡ �׳� ��� �� �� ����.
		//System.out.println( "speed = "+ speed);  // sedan���� speed field�� ���� �������� ��ӹ޾Ƽ� �׳� ���⼭ ��� ������.
		speedDown();
		//�ι� �ϸ� 2�� �����. 
		
		
		// �������� ���� Ŭ������ �ӿ������̵� �޽�� ȣ��
		super.speedUp(); // 1�� ����
		
		
		
		
	}   
	
	public static void main(String[] a) {
		//new Sedan().start(); // ���� ��� ����
		new Sedan(70);
	}
	
	
	
	
}
