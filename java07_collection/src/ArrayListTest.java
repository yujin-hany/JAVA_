import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	ArrayListTest() {}
	
	public void start() {
		Data d=new Data();
		List <MemberVO> lst =d.getMember(); // vo 4개 담긴 리스트로 여기도 제너릭
		
		// 확장된 for 문으로 access
		for (MemberVO  vo: lst) {
			System.out.println(vo.toString()); // vo 에 객체가 담겨져 있는데 우리가 toString 만들어놓은거 이용
		}
		
		System.out.println(lst.size());

	}
	

	public static void main(String[] args) {
	
		ArrayListTest at=new ArrayListTest() ;
		at.start();
	}

}
