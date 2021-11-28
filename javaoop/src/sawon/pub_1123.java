package sawon;

public class pub_1123 {
	String name="홍길동";
	private String addr="서울 영등포구 여의도";
	// 여기 글로벌 변수도 아무것도 안쓰면 default가 됨 =>그래서 클래스명이랑 생성 메쏘드가 
	// public이지만 글로벌 변수가 defaulㅅ라서
	
	// 생성자 메쏘드 만들기
	public pub_1123() {
		System.out.println("pub_1123");
	}
	
	public void namePrint() {
	System.out.println("name = "+name);
	}
	
	// 일반 메쏘드
	private void addrOutput() {
		System.out.println("주소"+addr);
	}
}
