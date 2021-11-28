
public class InterfaceMain   implements InterfaceTest, InterfaceA{
    // 클래스와 인터페이스 동시에 상속 받기 : 가능함
	// 클래스 먼저 상속받고 인터페이스 받는 것임.
	// 근데 이거 하면 인터페이스에서 만든 추상메쏘드를 다 overriding 해주어야 함. (무조건~)
	//인터페이스끼리 상속받을 수 있음 ( extends 사용,한 인터페이스는 하나의 인터페이스만 상속 받을 수 있음)
	// 클래스가 인터페이스 받을 때에는 여러개 가능, implements 사용
	
	
	
	
	// overriding 하기
	public  void add(int n1,int n2) {  //n1,n2가 아니라 a,b여도 됨.
		System.out.println(n1+n2);
	}
	
	public  void minus(int n1,int n2) {
		System.out.println(n1-n2);
	}
	
	public int getData() { 
		return 9999;
	}     // 
	// 원래 추상메쏘드에서는 void였는데 여기서 int 로 바꾸면 overriding이 아니라 그냥 따로 메쏘드 생성인것
	// 값은 나오긴 하마.
	// int로 리턴할 것을 적어주어야 함.
	
	
	// multiple 추상형 메쏘드는 그냥 실행문 없는 채로 overriding 가능
	// InterfaceA가 InterfaceB를 상속받았기에 InterfaceA만 불러도 자동으로 다 불러와짐
	public void multiple(int n1,int n2) {
		System.out.println(n1*n2);
	}
	
	
	
	
	//public static void main(String[] args) {
	//	InterfaceMain im= new InterfaceMain();
	//	im.add(10, 15);
		

//	}

}
