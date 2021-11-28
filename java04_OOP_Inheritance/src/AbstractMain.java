

//추상 클래스 상속 받으면 모든 추상 메쏘드는 하위 클래스에서 재정의 되어야 함[overriding]
//여기 빨간 줄은 overriding 되어 있지 않기 때문
public class AbstractMain extends AbstractClass {
	
	  // 클래스 밑에 바로 해야 함.
	//add 추상 메쏘드 overriding 하기  : 기존에서 abstract 만 제거
	public int add(int a, int b) {  //매개변수 명 변경해도 됨.
		int result=a+b;
		return result;
		
	}
	
	// 추상 클래스 오버라이딩 with no 실행문 : 이것도 오버라이딩 한거임
	// 기능구현할 꺼 없어도 추상클래스 {} 써주어야 함.
	public void multiple(int a,int b) {
		// 실행문
		
	}
	
	
	
	//추상 메쏘드만 모아 둘 수도 있음!!  :팀플 시 미리 메쏘드명 통일시켜두고 나중에 기능 추가하는 것 많이 함.
	//=> interface: 추상 메쏘드만 모아둔 !!클래스!! 의미함. (여기서 일반 메쏘드 쓰면 에러남)
	// 클래스에 대한 키워드 대신 interface interfaceename 이 들어감.
	//=> 근데 왜 클래스라고 하냐? 컴파일하면 .class 파일이 생겨서 그냥 클래스라고 함.(interfacename.class가 생성됨)
	// 일반 메쏘드 사용 시 에러
	//추상 메쏘드 외 올 수 있는건 public  final static 데이터타입 변수명=500; 이건 가능함.
	// final : 변경 불가 (MATH.PI와 같이 다 대문자로 만들어지는 것들로 한번 불어오면 변경 불가능함, 소문자로 써도 에러는 안난다고 함.)
	//static: jvm에서 사용하는 해당 변수명은 단 1개 뿐임 
	// public: 어디서나 접근 가능함.

	
	
	

	public static void main(String[] args) {
	
		AbstractMain am=new AbstractMain(); // 객체 생성하기
	
		// 메쏘드 호출하기
		am.minus(300,49);
		 
		System.out.println("am.add(189,981)->"+am.add(189, 981)); // 이건 리턴되는거라
		
		// 추상 클래스 객체 생성하기
		// AbstractClass at=new AbstractClass();  //추상메쏘드 있는 클래스의 객체 생성
		// 추상 메쏘드는 미완성이라 객체 생성할 수 없음. => 상속받아서 오버라이딩 해야 객체 생성 가능
		// new 로 못만드는게 calendar 와 유사함.

		
		
	}

}
