
public class MethodInner {
 
	String email="goguma777@nate.com";
	
	//생성자 메쏘드
	MethodInner() {}
	
	//일반 메쏘드
	public void createInner() {
		//InnerTest it=new InnerTest(); => 에러임 (먼저 메쏘드 실행되어야함)
		// 내부 클래스 : 객체를 생성하여 사용해야 함
		
		//지역변수
		String addr="서울시 영등포구 여의도동";
		
		
		class InnerTest{
			int num=5555;
			String userid="abcd";
			
			//생성자 메쏘드
			InnerTest() {}
			
			//그냥 일반 메쏘드 with no 기능
			void getInformaiton () {
				System.out.println("번호="+num);
				System.out.println("아이디="+userid);
				System.out.println("이메일="+email);
				System.out.println("주소="+addr);
			}
			
		}
		
		InnerTest it=new InnerTest();
		it.getInformaiton();
	}
	
	

	
	
	public static void main(String[] args) {
		//메쏘드 내의 내부 클래스는 다른 클래스에서 사용불가
		//new MethodInner().new InnerTest();
		new MethodInner().createInner();
		
	}
	

}
