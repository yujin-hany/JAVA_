import java.util.Scanner;
import java.util.InputMismatchException;
//2> 메쏘드 단위로 예외처리
public class ExceptionTest3 {
	Scanner scan=new Scanner(System.in);
	
	public ExceptionTest3() {}
	
	public void method1() throws ArrayIndexOutOfBoundsException, ArithmeticException,InputMismatchException {
		int num=scan.nextInt(); // InputMismatchException 나올 수 있음
		int num2=scan.nextInt();// InputMismatchException 나올 수 있음
		method2( num, num2);  //그러면 여기로 에러가 감 2)
	}
	
	public void method2(int num, int num2) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		int result=num/num2; //런타임에러로 나눌 때 0으로 나누면 에러임. : arithmeticException 
		System.out.printf("%d / %d = %d\n", num,num2,result);
		method3(num);//그러면 여기로 에러가 감 1>
		
		
	}
	// 여기서 예외 생기니까 여기서 예외 처리 해보자!
	public void method3(int num) throws ArrayIndexOutOfBoundsException{
		int arr[]=new int[num];
		arr[num]=562; //여기서 length-1이어야 에러 안남( arryindexouoftbounderror)
	}//그러면 여기로 에러가 감 0>
	
	
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException,InputMismatchException{
		//그러면 여기로 에러가 감 4>
		//=> 서로 책임전가하는 느낌
	//=> 메인메쏘드는 예외 책임 전가할 애가 없음
		
		ExceptionTest3 t=new ExceptionTest3();
		try {
		t.method1();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 예외 발생");
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나누면 안돼!");
		}catch(InputMismatchException ie) {
			System.out.println("정수를 입력하세요...");
		}
		

	}

}
