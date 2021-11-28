import java.util.ArrayList;
import java.util.List;


public class Data {

	public  List <MemberVO> getMember() { // 리턴을 arraylist로 하면 에러
		// 리스트가 상위라서 여기에 객체 담았는데 다시 더 하위인 arraylist로 받을 수 없음.
		MemberVO vo1=new MemberVO (100, "박길동","010-1234-5678");
		MemberVO vo2=new MemberVO (100, "닝닝이","010-4564-5678");
		MemberVO vo3=new MemberVO (100, "윈터","010-9823-5678");
		MemberVO vo4=new MemberVO (100, "카리나","010-1234-6519");
		
		//ArrayList : 클래스 - 여기에도 제너릭 그대로 사용 가능함.
		//List : ArrayList의 상위 추상클래스라서 이렇게 쓸 수 있음
		// ==> 많은 사람들이 arraylist를 list로 받음
		
		List <MemberVO>  lst=new ArrayList<MemberVO>() ;
		lst.add(vo1);
		lst.add(vo2);
		lst.add(vo3);
		lst.add(vo4);
		
		
		//SET을 이용하여 데이터 변경 시 ADD 와 달리 1번째 값 사라짐
		lst.set(1, new MemberVO(1000, "손흥민","010-5424-5652"));
		return lst;
		
	}
}
