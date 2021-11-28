import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	// 생성자 메쏘드
	public  ExceptionTest() {}
	
	
	public void start() {
		//Exception 처리 :software 로 제외 할 수 있는 에러를 말한다.
		//1. try~ catch 문 이용
		//2. 메쏘드를 이용하는 방법
		
	try {
		
		// try 문: 예외 발생 할 수 있는 코드와 
		//         예외 발생 가능성이 없는 코드를 기술한다.
			Scanner scan=new Scanner(System.in);
			System.out.print("숫자를 입력해라=");
			
			// nextInt()로 받음
			int num= scan.nextInt();
			
			System.out.print("정수 입력=");
			int num2=scan.nextInt();
			
			
			int result=num/num2;
			System.out.printf("%d / %d= %d\n", num,num2,result);
			System.out.println("num="+num);
			
			
			int arr[]=new int[5];
			arr[arr.length ]=100; // 
			
			
	   } catch (InputMismatchException ime) {  //ime가 뭐 때문에 에러 생겼는지 갖고 있음.
		   // 예외가 발생하면 실행되는 영역 (예외 발생 안하면 여긴 실행 안됨.)
	    	System.out.println("문자를 입력할 수 없습니다.");
	    	
	    	
	    	//이건 return 이 string
	    	//getMessage();
	    	System.out.println(ime.getMessage()); //=> null이 나옴
	    	
	    	
	    	// printStackTrace(); : 
	    	//return 이 없으며 에러 처리 전이랑 결과 같음
	    	ime.printStackTrace();
	    	
	    	
	   } catch(ArithmeticException ae) {
		   System.out.println("0으로는 나눌 수 없습니다");
		   System.out.println(ae.getMessage());
		   
		   ae.printStackTrace();
	   
	
		} catch(ArrayIndexOutOfBoundsException aa) {
		System.out.println("인덱스 초과입니다.");
		System.out.println(aa.getMessage());
		aa.printStackTrace();
	}
	    	
	    
	
		//System.out.println("Thee end,,,,");  //예외 발생여부와 관계없이 여기 거쳐감 (정수나 정수나 다 여기 거침)
	}

	public static void main(String[] args) {
		new ExceptionTest().start();
	}

}







