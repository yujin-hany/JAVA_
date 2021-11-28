
public class Member {

	int sabun;
	String name;
	
	static String position;
	
	// 생성자 메쏘드
	Member () {
		
	}
	Member ( int sabun, String name, String positsion){
		this.sabun=sabun;
		this.name=name;
		this.position= position; //같은 패키지 내에서는 member.position 가능함. 왜냐면 static이라 객체만들 필요 없음.
}
	void memberOutput() {
		System.out.printf("%8d %8s %8s", sabun, name,position);
		
	}
	
	void data() {
		//static String email; //지역변수의 경우 data() 실행 안되면 email 자체 만들어지지 않아서 지역변수에서는 static 사용 불가능 (자체 에러임)
		
	}
	
	public static void main (String[] a) {
		System.out.println(Member.position);  // => 여기는 null since 데이터를 넣은 적이 없어서 그냥 초기값임.
		//단 지역변수는 static이 의미가 없음 왜냐면 이건 그냥 끝나면 사라지는 애니까
		
		Member m1=new Member();
		Member m2=new Member(5, "홍","과장");
		Member m3=new Member(200, "최","부장");
		m1.position="부장";		
		m2.memberOutput();  // m1.position 의 값이 여기 position으로 나옴(부장)
		
		System.out.println(Member.position);  //static꺼라서 그냥 클래스.position 가능하고 부장으로 나옴
		// static position 은 변수 1개라 그냥 마지막껄로 값이 됨.
		//sabun=500; // 이건 에러임 왜냐면 객체 안만들고 변수 씀.
		//position="차장"; // static이라서 객체 안만들고도 사용 가능 +동일 클래스 내 있음
		
		
	}
}
