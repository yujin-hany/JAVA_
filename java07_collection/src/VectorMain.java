import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Vector;

public class VectorMain {
	
	public VectorMain( ) {}
	
	public void start() {
		 // VectorTest 데려와야 함.
			VectorTest vt=new VectorTest();
			
			// 인덱스가 있음
			// 객체를 가지고 나와도 객체가 지워지지 않음
			// 컬렉션 중 객체 가지고 나오면 지워지는 애도 있음.
			
			
			// 벡터가 리턴되니까 벡터로 설정해야 함.
			Vector v=vt.getData();
			
			// 객체의 개수 구하기
			System.out.println("객체 수"
					+ "->"+v.size());
			
			// 근데 이거 object으로 들어가 있기 때문에 꺼내서
			// 형 변환을 해줘야 함.
			// 0번째 객체 가지고 나와서 어떤 클래스인지 알려줘야 함.
			
			// MmeberVo는 private이라 getNum () 이런거 메쏘드 써야함.
			MemberVO vo=(MemberVO) v.get(0);  
			System.out.println(vo.getNum()+','+vo.getUserName()+','+vo.getTel());
	
			String txt=(String)v.get(1);
			System.out.println("Txt->"+txt);
			
			Random r=(Random)v.get(2);
			System.out.println("Random->"+r);
			
			Calendar c=(Calendar) v.get(3);
			System.out.println("Calendar->"+c); // 이렇게 하면 해당 날짜 정보 다 나옴
			
			SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(fmt.format(c.getTime()));
			
			
			// 아니면 int d=(Integer)v.get(4);도 가능
			int d=(int)v.get(4);  // 기존 int 인데 vector에 넣어서 object로 저장되었기에
			//다시 int를 int로 형 변환 해주어야 함.
			System.out.println("d->"+d);
			
			
			// 제너릭 벡터 출력하기 :vt가 VectorTest의 객체
			Vector<MemberVO> list =vt.getMember();
			
			// => 같은 클래스로 만들었고 해당 클래스로 나오는거니까
			//그냥 for문으로 찍어도 된다
			
			for (int i=0; i<list.size(); i++) {
				
				MemberVO vecVo=list.get(i); // 0,1,2,3,4 번째 객체가 주르륵 나옴
				// 제너릭이라 형 변환이 필요 없음.
				
				//System.out.println(vecVo.getNum()+','+vecVo.getUserName()+','+vecVo.getTel());
				System.out.println(vecVo.toString());
			}
	}

	public static void main(String[] args) {
		VectorMain vm= new VectorMain();
		vm.start();
	}

}










