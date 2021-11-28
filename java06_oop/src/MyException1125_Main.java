
import java.util.Scanner;
import java.util.InputMismatchException;
//반드시 1~100 사이의 값을 입력받아 입력받은 수까지의 합을 구해라
public class MyException1125_Main {

	Scanner scan=new Scanner(System.in);
	MyException1125_Main() {}
	
	
	//합 구하기
	public void sum(int max) {
		int total=0;
		for (int i=1; i<=max; i++) {
			total+=i;
		}
		System.out.println("1~"+max+"까지의 합은"+total);
	}
	
	public void start() {
	 try {
		 System.out.print("1-100 사이의 정수=");
		 int max=scan.nextInt();
		 
		 if (max>=1 && max<=100) {
			 sum(max);
			 
			 // 1과 100 사이의 값이 아님
		 }else {
			  // !!!예외를 강제로 발생시켜야 함!!!
			 throw new MyException1125("입력값은 1~100사이의 값의 데이터여야 합니다."); //메시지가 바뀌는 상황
			 // myException 이라는 예외가 강제로 발생됨/
			 //==> 이걸 잡을 catch 문이 필요함.
			 
		 }
		 
	 }catch(InputMismatchException ime) { 
		 System.out.println("숫자만 입력해야 합니다.");
		 
	 }catch(MyException1125 me) {
		 System.out.println(me.getMessage());
	 }
	}

	public static void main(String[] args) {
		MyException1125_Main mt=new MyException1125_Main();
		mt.start();

	}

}
