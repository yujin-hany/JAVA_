/// 추상 클래스는 추상 메쏘드를 1개 이상 포함하고 있는 메쏘드
// 추상 메쏘드는 메쏘드명과 반환이 정해지고 실행문은 없는 메쏘드를 의미한다.
// 추상 클래스는 객체 생성이 불가능하며 반드시 상속을 받아서 overriding 해주어야 함.

public abstract class AbstractClass {
	int data=200;
	
	// 생성자 메쏘드
	public AbstractClass() {}
	
	//합 : 추상메쏘드로 하자 => 반환형 왼쪽에 abstract 이라고 넣어야 함.!!
	//: public 리턴타입 메쏘드명(매개변수) : 
	public abstract int add(int n1,int n2);
		
		
	
	
	//차
	  public void minus(int n1, int n2) {
		  int result=n1-n2;
		  output(n1,n2,result, "-");
		 // System.out.printf("%d-%d=%d",n1,n2,result);
	  }
	  
	//곱
	 public abstract void multiple(int n1, int n2);
	  
	  
	//몫
	  public void divide(int n1,int n2) {
		  int result=n1/n2;
		  output(n1,n2,result,"/");
		
	  }
	  
	  //출력문도 메쏘드를 만들어서 반복을 방지하자
	  public void output(int n1,int n2, int result,String operator) {
		  System.out.printf("%d %s %d=%d",n1,operator,n2,result);
	  }
	  
	  
}
	
	
	
	


