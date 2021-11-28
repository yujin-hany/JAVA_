import java.util.Calendar;
import java.util.Random;
import java.util.Vector;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatTest {

	public static void main(String[] args) {
		 // 출력 형식을 이용하여 정보를 변환하기
		// 1> 날짜
		Calendar c=Calendar.getInstance();
		
		//2021-11-26(금) 11:21:12 (오전) : 형식 만들기
		SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss a");
		
		// date 찾아서 frm 에 넣어주어야 함.
		//getTime은 date를 찾아주고 여기에 format으로 감싸면 string 으로 나옴
		
		String dateFrm=frm.format(c.getTime());
		System.out.println(dateFrm);
		
		
		//숫자 형식의 포맷
		//2354862->2,354,862원 이렇게! : 뒤에 기준 3자리마다 , 찍고 뒤에 원을 붙여라
		// # : 숫자
		int data=2354862;
		DecimalFormat fmt2=new DecimalFormat("#,###원"); // 이렇게 하면 숫자가 커져도 3자리마다 , 찍힘
		String decimalData=fmt2.format(data); 
		//==> 이건 스트링이라 계산 불가능 (그냥 표현 형식)
		// 우리가 가진건 int고 format안에는 long, double등으로 나온다고 되어있지만
		///어차피 int보다 long, double이 크니까 그냥 찍으면 됨
		System.out.println(decimalData);
		
		//패턴화된 데이터를 원래 정수로 변환하기 : 계산  필요 시
		// getInstance 이용하여 객체 생성
		
		 try {
			NumberFormat nf=NumberFormat.getInstance();
			Number n=nf.parse(decimalData);  //  "," 빼기
			// 이거 Number 클래스
			
			// unhandled exception 나옴=> try -catch 
			// 숫자로 못바꾸는 데이터인 경우 에러남.
			int won=n.intValue();
			System.out.println("won->"+ won);
			
			 }catch(ParseException pe) {
				 System.out.println("숫자로 변환하지 못하였습니다."+pe.getMessage());
			 }
		
		
	}

}
