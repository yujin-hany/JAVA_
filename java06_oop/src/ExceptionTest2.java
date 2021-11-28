import java.util.Scanner;

public class ExceptionTest2 {

	
		public ExceptionTest2() {}
		
		public void start()          {
			//Exception 처리 :software 로 제외 할 수 있는 에러를 말한다.
			//1. try~ catch 문 이용
			//2. 메쏘드를 이용하는 방법
			
		try {
			
			// try 문: 예외 발생 할 수 있는 코드와 
			//         예외 발생 가능성이 없는 코드를 기술한다.
				Scanner scan=new Scanner(System.in);
				System.out.print("숫자를 입력해라="); 
				
				// nextInt()로 받음
				int num= Integer.parseInt(scan.nextLine());////
				
				System.out.print("정수 입력=");
				int num2=scan.nextInt(); ///
				
				
				int result=num/num2;////
				System.out.printf("%d / %d= %d\n", num,num2,result);
				System.out.println("num="+num);
				
				
				int arr[]=new int[5];
				arr[arr.length-1]=100;////
				
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
			
			
		} catch(NumberFormatException ne) {
			System.out.println("문자를 숫자로 바꿀 수 없다.");
		
		
		
			// 이건 모든 예외를 받는거라서 마지막으로 넣어야함!!! 이거 위로 올리면 우선순위가 되기 때문에
			// 다른 exception 종류 컴파일이 불가능함.
		}catch(Exception e) {//!!! 모든 상위 클래스에 있음=> 모든 예외를 대입할 수 있다.!!!
			e.printStackTrace();
			
			
			
			
		} finally { 
				// 예외 발생 여부에 관계없이 실행됨.
			System.out.println("finallly 실행...");
			try {
				
				
				
			}catch(Exception e) {}
		  //이렇게 finally 안에도 예외 처리 가능하다
		
		}		
		}		

		//}
	public static void main(String[] args) {
		new ExceptionTest2().start();

	}
	

}






