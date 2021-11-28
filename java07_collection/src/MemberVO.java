
public class MemberVO {
	//데이터 보관 역할
	
	// 변수 선언 FOR DATA STORAGE
	//객체를 통해 접근하지 못하게 접근제한자 사용
	private int num;
	private String userName;
	private String tel;
	
	
	
	// 매개변수 없는 것과 매개변수 있는 생성자를 만들기
	// 왜냐면 이거 안하면 데이터 20개면 getter/setter 총 40개 필요함
	
	public MemberVO() {}
	public MemberVO(int num,String userName, String tel) {
		this.num=num;
		this.userName=userName;
		this.tel=tel;
	}
	
	
	// 규칙 지켜서 만들자
	
	// SETTER: 데이터 받을 때 set+받을 데이터의 앞글자만 대문자로 => 번호를 세팅해주는 메쏘드
	public void setNum(int num) {
		this.num=num;
		
	}
	
	//GETTER: 번호를 외부로 가져갈 수 있게 해주는 메쏘드
	public int getNum() {
		return num;
		
	}
	public void setUserName(String userName) {
		this.userName=userName;
		
	}
	public String getUserName() {
		return userName;
		
	}
	public void setTel(String tel) {
		this.tel=tel;
		
	}
	
	//GETTER: 번호를 외부로 가져갈 수 있게 해주는 메쏘드
	public String getTel() {
		return tel;
		
	}
	
	
	
	
	// 회원 정보를 문자열로 만들어 리턴하는 메쏘드 생성하기
	//=> toString 은 Array.toString 에 서 써봄
	// 이거 toString 이라는 메쏘드가 object에 있는데 여기서 동일한 이름으로 재정의 : overriding 
	public String toString() {
		String result=num+"\t"+userName+"\t"+tel;
		return result;
		
	}
	
	
	
	
	
	
	
	
	
}
