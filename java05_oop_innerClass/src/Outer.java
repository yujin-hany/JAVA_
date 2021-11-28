
//내부 클래스 : 클래스 내 클래스를 정의하여 마치 상속받은 것 처럼 사용한다. <= 여러개를 내부 클래스로 만들 수 있음.
// 1>멤버 영역의 내부 클래스
// 2> 메쏘드 내의 내부 클래스
// 3> 익명(anonymous)의 내부 클래스


// 이건 멤버 영역의 내부 클래스
public class Outer {
	int num=1234;
	
	String name="홍길동";
	Inner inner =new Inner();
	
	//생성자 메쏘드
	public Outer() {
		System.out.println("Outer()....");
	}

	// 그냥 메쏘드
	public void output() {
		System.out.println("번호="+num);
		System.out.println("이름"+name);
		//System.out.println("전화번호"+tel);
		
		//외부클래스에서 내부 클래스의 멤버변수는 접근 할 수 없다.
	}
	
	public void createInner() {
		Inner inner=new Inner(); //지역변수임. 
		System.out.println("inner.num--> "+inner.num); //이렇게 해야 외부에서 내부 접근 가능함
		inner.getMember();
		
		
	}
	

	//내부 클래스
	class Inner {
		//변수 선언 가능
		int num=5678;
		String tel="010-4799-9356";
		
		//생성자 메쏘드
		Inner () {
			System.out.println("Inner()....");
			
			
		}
		
		void getMember() {
			System.out.println("num="+num+", tel="+tel+" name="+name);
			// 내부 클래스는 외부 클래스의 모든 멤버변수에 접근 할 수 있다.
			//System.out.println(Outer.num);
			
			
			//내부와 외부에 같은 이름으 변수 있으면 내부에서 외부의 같은 이름 변수 super 등으로도 접근 불가
		}
	}
	
	public static void main (String a[]) {
		
		Outer outer=new Outer();
		outer.output();  //내부 클래스 유무에 관계없이 외부 클래스는 그냥 상관 없이 쓸 수 있음.
		
		// 내부 클래스 사용하려면 외부 클래스 있어야 함.
		//내부 클래스 객체 생성하기 : !!!외부 클래스 객체를 만들고 나서 내부 클래스 객체 만들어야 함 !!!
		
		Outer.Inner i=new Outer().new Inner();	
		Outer.Inner ii  =outer.new Inner(); // 외부 객체명.new Inner();
		
		i.getMember();
		ii.getMember();
		
		outer.createInner();
	}
	
}
