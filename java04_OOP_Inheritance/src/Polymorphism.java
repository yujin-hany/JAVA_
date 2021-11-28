
public class Polymorphism {

	public static void main(String[] args) {
		
		
		// 객체 만들어서 타입을 object로
		Car c=new Car() ; // 상위 클래스 객체/자신의 클래스 객체로 받을 수 있음.
		
		
		// 에러 아님.. 왜??
		//상속관계 때문임. :모든 클래스는 object을 제일 최상단 클래스로 가지고 있음.
		//=> 하위 클래스 객체를 상위 클래스 객체에 대입하면 자동으로 형변환이 된다.
		Object o=new Car();  
		
		c.speedUp();
		
		// o.speedUp() ; // 에러임.speedUp() 은 Car 에 있는 것이지 Object에 있는 것이 아님
		
		
		//형 변환
		//Car c2=o;  // 에러임
		// Car로 객체를 만들어서 상위 클래스형에 넣을 때는 자동으로 쏙 들어감.
		//근데 Car의 기능이 object에서는 없으니까 다시 형 변환을 해서 
		// 상위 클래스 타입을 하위 클래스 타입으로 변환하는 것
		//  ==> 자동이 아니라 강제로 형 변환 시켜야 함.
		
		Car c2=(Car)o;  // => 형 변환 시키면 나옴.
		c2.speedUp(); //이제 변환하니까 나옴
		
		
		
		
		
		//sedan s=new Car() ;
		//이건 안됨.
		// 상위 클래스 객체를 하위 클래스 객체에 대입하는 것으로 이건 불가능
		// 왼쪽에 있는 것이 상위클래스여야함.
		
		
		
		
		// Interface 의 형변환
		InterfaceMain m=new InterfaceMain(); // InterfaceMain에서 인터페이스 2개 상속받아서 overriding 해둠.
		InterfaceTest t=new InterfaceMain();
		InterfaceA a=new InterfaceMain();
		InterfaceB b=new InterfaceMain();
		Object obj=new InterfaceMain();
		
		
		t.add(10,20);
		System.out.println(a.getData()); // 이거 밖에 가능한 메쏘드 없음
		b.multiple(10,20); // empty 실행문이 안에 있으면 아무것도 안나와서 이거 변경함.
		
		
		 InterfaceMain im= (InterfaceMain) a; // a 객체를 IntefaceMain 으로 형 변환해서 im에서 넣음
		im.minus(600,300);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
