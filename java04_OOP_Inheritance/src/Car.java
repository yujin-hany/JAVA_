
public class Car {
        //���� �ӵ��� ���� �� �� �ִ� ����
	int speed=0;
	
	//������ �޽��
	public Car() {
		speed=100;
		System.out.println("CAR() ������"+speed);
	}
	
	
	public Car(int speed) {
		this.speed=speed;
		System.out.println("CAR(INT speed) ������");
	}
	
	//���������� ������ ȣ�� �� �޽��
	public void speedUp() {
		speed+=1;  //������ �ö󰡸� �ȵǴϱ� �ְ� ����� �ش� : �ִ�ġ�� �����Ѵ�
		
		if (speed>=150) {
			speed=150;
		}
		System.out.println("Car Speed up = "+speed);
		
	}
	
	//�극��ũ ������ ȣ�� �� �޽��
	public void speedDown() {
		speed--;
	
		//speed�� �ּ� ���ǵ带 ���� ���ֱ�
		if (speed<0) {
			speed=0;
		}
		System.out.println("Car Speed down= "+speed);
	}

}
