
public class ClassTest2 {
	
	
	int num; // 초기치 0임.
	String name; // 초기값 null임.
   //멤버영역
	
	//생성자 메쏘드 : 클래스명과 동일해야 하며, 매개변수 없는 것을 하나 만들어주는 것이 좋음(상속관계에서는 넣지 않음)
	// 여러개 가능 with 매개변수 개수 및 종류 다르면
	ClassTest2() {}  
	ClassTest2(int num){
		this();  // 위의 ClassTest2() {} 실행시키는 것
		
		this.num=num;   //메쏘드 내 num != 전역변수 num (표기는 동일하나 같은건 아님)
		   // 자신의 현재 클래스의 멤버영역 의미 (변수명 같을 시 this 쓰는거고 변수명 다르면 따로 안해도 됨)
		// 같은 데이터라 그냥 변수명 같이 쓰고 this 쓰는것이 암묵적인 룰
		  // 글로벌변수 int num=100; 이 객체 생성시 넘어감.
		//멤버변수와 지역변수 같을 시 현재 클래스의 멤버영역을 지정하는 키워드가 this
		
		//만약 이 메쏘드 실행 후 타 메쏘드 실행하는데 거기서 this.num=num 이 있다면
		// 해당 num이 멤버영역의 글로벌변수인 num으로 넘어가는 것
		
	}
	
	

	  ClassTest2 (int num, String name){  //이거 실행 후 num, name 사라짐
		  //this.num=num;    // => 여기서 실행 후 매개변수를 글로벌 변수로 넘김.
		  //!!!생성자 메쏘드에서 다른 생성자 메쏘드 호출하기
		  //  this 키워드는 반드시 첫번쨰 실행문이여야 함!!!
		  //int a=200; // 이렇게 하면 this 키워드가 두번쨰 실행문이 되어서 에러임.
		  this(num);  // this :해당 클래스 가리킴, 매개변수인 num을 갖고 있는 생성자 호출됨.
		  this.name=name;
	 
	  }
	  // 위에 있는 ClassTest2( int num) 에서 this.num=num 으로 이미 있으니까
	  //반복하지 말고 ClassTest2( int num, String name) 에서 그냥 ClassTest(int num) 을
	  //호출하자! 
	  
	  
	  
	void sum() { // 현재는 public 생략 가능=> 일반메쏘드임( 메쏘드명이 클래스 이름이 아님)
		int s=0;
		for (int i=1; i<=num; i++) {
			s+=i;
		}
		System.out.println("1~"+num+"까지의 합은"+s); //메쏘드 내 멤버변수 사용하고 있는 것
	}
}
