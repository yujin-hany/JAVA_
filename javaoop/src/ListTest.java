
//import java.util.*; 이렇게 하몀ㄴ util 내 모든 메쏘드 가져오는 건데 메모리 많이 가져와서 비추임..
// 캘린더, 랜덤, 스캐너 모두 util 에 있음
// 멤버 영역에 아무것도 없으면 자동으로  해당 클래스 명으로 .class 만들어짐
// bin에 있는건 default package라 package 필요 없음
// sawon패키지의 member 패키지 내에 있으먄 package sawon.member로 접근 해야함.


import java.util.Scanner; 
import java.util.Random;
import java.util.Calendar;

// main 이 없어서 출력을 할 수가 없음. 시작점이 없는 것과 같음.
//생성자 메쏘드 종류만큼 객체 만들 수 있음.
//여기에 있는 변수 중 하나를 타 클래스 파일에서 쓰고 싶으면 여기꺼 이름으로 객체 만들어야 함.
public class ListTest {
   // 멤버 영역 (Field 변수)
	// 실햄문을 여기에서는 사용 불가하나 static{}  사용시 사용 가능하며
	// static 시 {} 하면 가능한데 타 클래스에서 여기 클래스 객체 생성 시
	// static에 있는 명령문이 가장 먼저 실행됨!!!
	
	int num=100;
	String name;
	
	double data=14.2;
	Scanner scan=new Scanner(System.in);
	
	static {
		// 실행문을 멤버 영역에서 처리할 때
	System.out.println("멤버영역에서 메소드 호출");
	}
	int result=(int) (num+data);
	
	//생성자 메쏘드 :Constructor method
	// 메쏘드명이 클래스명과 동일하며 반환형이 없음
	//생성자 메쏘드는 여러개 만들수 있음. (단, 매개변수의 개수 : () 안 혹은 데이터 형이 달라야함.)
	//생성자 메쏘드는 객체 생성 시 한번 실행됨. ( 다시 실행되지 않음)
	
	ListTest() { //이게 생성장 메쏘드
		System.out.println("why ?");
	}
	
	ListTest(String n) {
		System.out.println(n+"ClassTest()...........");
		
	}
	
	ListTest(int n) {
		System.out.println(n+"ClassTest()...........");
		
	}
	
	ListTest(int n,String name) { // 아래와 순서와 다름.
		
		System.out.println(name+"Please don't take test..."+n);
	}
	
	ListTest(String name,int n) {
		
		System.out.println(name+"Please don't take test..."+n);
	}
	
	//기능형 메쏘드를 변수 => 생성형 메쏘드 밑에 보통 만듬
	// 순서 바뀌어도 상관은 없지만 이게 암묵적인 룰: 변수=> 생성형=>기능형 메쏘드
	// 메쏘드: 하나의 작업 단위
	// 
	// 접근 제한자 : public , private 이런건데 이런건 나중에 설명하신다고 함.
	//접근 제한자 반환형: void => 메소드의 실행결과가 돌아오는 값이 없다.
	// return 할 꺼면 void 자리에 int/Calendar/String/Scanner 등 객체 클래스나 데이터타입을 써주기
	// 기능형 메쏘드 ==> 재사용 가능함. 이걸 객체로 만들면!!
	// 메쏘드 명은 무조건 소문자로 시작, 합성어의 경우 두번째 단어에서의 첫 글자를 대문자로 한다
	
	
	public void sum() {  // 기능형 메쏘드 이름이 sum
		int tot=0;
		for (int i=1; i<=100; i++) {
			tot+=i; 
		}
		System.out.println("합은="+tot);
		
		
		System.out.println("total=>"+total(200)); // sum() 메쏘드 부르면 여기 안에 있는 total() 메쏘드를 출력해줌.
		 // 실행문 및 객체만들기 등등 우리가 배웠던 걸 여기에 쓰는 것
		//main method 에 썼던 걸 여기에 쓰는 건데 작업 단위를 여기에 나누어서 쓰기
	}
	
	public int total(int max) {  //total 이라는 메쏘드 호출 시 정수 하나 넣어주어야 함.
		int sum=0;   // int max는 지역변수임.
		for ( int i=1; i<=max; i++) { // 호출은 객체명.total(50);
			sum+=i;
			
		}
		return sum;  // 가지고 나갈 꺼를 여기에다 씀!!  이거 안쓰면 에러임.
		// 리턴을 두개 이상 해야 하면 array 를 쓰는데 자료형이 다르면 collection 이라는 클래스를 나중에 사용할 것
	}
}
