import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorTest {
	
	public  Vector getData() { // 리턴 타입을 벡터로
		
		MemberVO vo=new MemberVO(200,"홍길동","010-4799-9356");
		
		
		// 여기 변수들은 다 default 인 것
		Random random=new Random();
		Calendar date=Calendar.getInstance();
		date.set(2020,10,30);
		
		String str="세종대왕"; // 스트링 객체
		int intData=1234;
		
		// 데이터 타입이 달라서 컬렉션 써야 함.
		// 데이터 타입 다르니까 generic  사용 불가능 => <E> 지울 것
		
		Vector v= new Vector();
		System.out.println("capacity"+v.capacity());
		
		
		// vector에 객체  추가하기
		v.add(vo);  //0 th
		v.addElement(random);//2th
		v.add(date); //3th
		v.add(1, str); //1th
		v.addElement(intData);  //4th
		
		return v;
		
	}
	
	
	// 같은 클래스에서 나온 객체를 벡터에 클래스 지정하여 넣어보기==> 제너릭을 쓸 수 있음
	//=> gereric 쓰면 한 종류의 객체 밖에 못넣음.
	// => 이거 쓰면 그냥 넣고 꺼낼 때 변환 안하고 꺼낼 수 있음~
	
	public  Vector<MemberVO> getMember() { //반환형에 벡터+제너릭 넣어주어야 함.
		MemberVO vo1=new MemberVO (100, "박길동","010-1234-5678");
		MemberVO vo2=new MemberVO (100, "닝닝이","010-4564-5678");
		MemberVO vo3=new MemberVO (100, "윈터","010-9823-5678");
		MemberVO vo4=new MemberVO (100, "카리나","010-1234-6519");
		
		// MmeberVO 만 넣을 수 있는 벡터다
		Vector  <MemberVO>  v=new Vector <MemberVO> ();
		v.add(vo1);
		v.add(vo2);
		v.add(vo3);
		v.add(vo4);
		//v.add(new Random());  : 이거 에러임 since it's not MemberVO INSTANCE
		
		return v;
		
	}
	


}
