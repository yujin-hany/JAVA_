

// 기본 클래스 명에 extends + 상속받을 클래스명
public class Sedan extends Car {
   //car에서 만들어둔 기능이 기본으로 필요함 => car 클래스 상속 필요함  : 기본 클래스 명에 extends + 상속받을 클래스명
	// 상속은 클래스 단위로 함.
	//아무것도 구현을 하지 않았고 생성자 메쏘드도 구현하지 않음 => 자동으로 생성되지 않음.
	// ==> 상속 시 매개변수 없는 생성자 만들어두기
	
	
	
	//상위 클래스의 필드값은 0인데 여긴 초기값 50으로 함. 
	int speed=50;
	
	//생성자 메쏘드 생성 안해두면 아무것도 안나옴?? 체크 하기
	public Sedan() {
		speed=90;
		System.out.println("SEDAN() 생성자");
	}
	
	
	public Sedan(int speed) {
		super(78);
		this.speed = speed;
		System.out.println("SEDAN(int speed)생성자 ");
		
	}
	
	
	
	
	
	
	
	public void speedUp() {   //Car에 있는 메쏘드랑 똑같이 생김. 근데 난 여기서 1이 아니라 10씩 증가시키고 싶음 : 
		// = 상위 클래스의 매쏘드을 하위 클래스의 매쏘드에서 재정의 : 오버라이딩
		super.speed+=10;
		if (super.speed >250) {
			super.speed=250;
		}	
		System.out.println("SEDAN speedup= "+super.speed);
		// 이거 하면 기존 car의 매쏘들을 지우고 이걸 덮어씌우는 거라
		// 기존 car에 있던 프린트문도 없어져서 프린트 따로 하려면 또 써야 함.
	}
	
	
	
	public void start() {
		//Sedan s=new Sedan(); // Sedan 클래스의 객체 생성
		//s.speedUp();
		
		
		speedUp();
		speedUp(); //객체 안만들고 이렇게만해도 나옴 ( CAR 에 있는건 다 SEDAN에도 있기에 그냥 사용 할 수 있음.
		//System.out.println( "speed = "+ speed);  // sedan에는 speed field에 정의 안했으나 상속받아서 그냥 여기서 사용 가능함.
		speedDown();
		//두번 하면 2로 변경됨. 
		
		
		// 하위에서 상위 클래스으 ㅣ오버라이딩 메쏘드 호출
		super.speedUp(); // 1씩 증가
		
		
		
		
	}   
	
	public static void main(String[] a) {
		//new Sedan().start(); // 증가 잠시 빼자
		new Sedan(70);
	}
	
	
	
	
}
