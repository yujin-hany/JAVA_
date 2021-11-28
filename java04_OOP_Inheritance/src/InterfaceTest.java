

// 인터페이스는 추상메쏘드를 표기하는 곳이다.
// 일반 메쏘드는 정의 할 수 없으며, 여기에 사용 할 수 있는 것은 추상 메쏘드 혹은 static final 메쏘드 이다.

public interface InterfaceTest {
	
	//static final 변수
	public static final int CODE=1234;  
	public static final String ADMIN_ID="master";  
	
	
	// 추상메쏘드 => 인터페이스에서는 메쏘드명만 명시함.
	public void add(int a, int  b); 
	public void minus(int a, int b);
	
	
	// 그럼 이거 어떻게 사용?
	//보통 abstract class 상속받은 클래스[extends]에서 overriding 해서 객체 생성하여 사용함.  
	//근데 이건 interface임 (class 가 아님) 
	// 기본적으로 클래스에서 인터페이스를 상속받음.단, 상속받는 키워드는 implement임
	// 인터페이스는 여러개 받을 수 있음 (상속은 클래스 하나만 extend로 받을 수 있음)
	// 
	
	
}
