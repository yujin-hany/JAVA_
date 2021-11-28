
import java.util.Scanner;


//메쏘드 간 연결해서 생각하지 않고 따로 생각해서 할 것
public class Gugudan {
//  구구단에 관련된 기능을 여기에 만들겠다 : 이런것...
	CalculatorEx cc= new CalculatorEx(); // 객체 만들기=> 이렇게 하면 무조건 실행되고 남아있음.
	//일반 메쏘드 : 한 단 찍기
	void gugudan(int dan) {  //리턴 없는 일반 메쏘드임랙 
		for (int i=2; i<=9; i++) {
			//CalculatorEx cc= new CalculatorEx(); // 객체 만들기
			int result=cc.multiple(dan, i); // cc 객체 안의 multiple 
			System.out.printf("%d*%d=%d\n", dan,i,result);
			
		}
		
	}
	
	
	
	void allGugudan() {
		for (int dan=2; dan<=9; dan++) {
			for (int i=2; i<=9; i++) {
				//gugudan 메쏘드가 실행될 동안에만 cc가 남아있는 것이고
				// gugudan과 allgugudan 동시 실행 불가능하기에 이런 경우 객체 생성을 멤버에 하는 것이 조 ㅎ음
				System.out.printf("%d*%d=%d\n",dan,i,cc.multiple(dan, i) );   // \n 은 줄바꾸기야
			}
		}
	}
	
	//콘솔에서 정수를 입력받고 return 해주는 메쏘드
	int consoleInput(String msg) {
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"=");
		return scan.nextInt();
		
	}
	
	
	
	
		

	}


// 멤버 영역에 변수 없음 :변수 있으면 편하긴 함
// 생성자 메쏘드 2개 (매개변수 없는거 하나, int 갖고 있는 것 하나)
// 일반 메쏘드 : 1>단을 매개변수로 받아서 해당 단을 출력하는 메쏘드
// 2> 구구단 2단에서 9단까지 한번에 나오는 매쏘드
// 3> 콘솔에서 단을 입력받는 메쏘드
//  