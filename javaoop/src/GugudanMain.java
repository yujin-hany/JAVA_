
public class GugudanMain {

	public static void main(String[] args) {
	  Gugudan gugu=new Gugudan();  //구구단 클래스 객체 생성하기
	  
	  //구구단 전체 찍기
	  gugu.allGugudan();
	  
	  //한 단만 찍기
	  gugu.gugudan(19);
	  
	  int d=gugu.consoleInput("단을 입력하세요...");  // 매개변수는 string, 정수 리턴해준다고 해둠.
	  // 콘솔에서 메시지+ = 해두어서 이거 들어감.
	  // 변수로 안받으면 정수가 사라져서 변수로 받아줘야함
	  

	  gugu.gugudan(9);
	  
	}

}
