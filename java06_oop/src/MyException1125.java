
// 사용자 정의 예외처리 클래스 만들기~
//Exception을 상속받기=> Exception 위의 클래스들도 여기에 들어옴.


public class MyException1125 extends Exception {
	
	
	public MyException1125() {
		//상위 클래스인 Exception 의 생성자 메쏘드를 호출하여
		//예외 메시지를 설정한다.
		
		super("1~100사이의 값이 아니다");
	}
	
	
	public MyException1125(String message) {
		super(message);  
	}

}
