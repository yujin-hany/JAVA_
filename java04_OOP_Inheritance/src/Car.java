
public class Car {
        //현재 속도를 저장 할 수 있는 변수
	int speed=0;
	
	//생성자 메쏘드
	public Car() {
		speed=100;
		System.out.println("CAR() 생성자"+speed);
	}
	
	
	public Car(int speed) {
		this.speed=speed;
		System.out.println("CAR(INT speed) 생성자");
	}
	
	//엑셀레이터 밟으면 호출 할 메쏘드
	public void speedUp() {
		speed+=1;  //끝까지 올라가면 안되니까 최고 출력을 준다 : 최대치를 제한한다
		
		if (speed>=150) {
			speed=150;
		}
		System.out.println("Car Speed up = "+speed);
		
	}
	
	//브레이크 밟으면 호출 할 메쏘드
	public void speedDown() {
		speed--;
	
		//speed의 최소 스피드를 제한 해주기
		if (speed<0) {
			speed=0;
		}
		System.out.println("Car Speed down= "+speed);
	}

}
