
public class CalculatorEx {

  int plus(int n1, int n2) {
	  return n1+n2;
  }
  
  int minus( int n1, int n2) {
	  return n1-n2;
  }
  
  int multiple(int n1,int n2) {
	  return n1*n2;
  }
  
  int divide(int n1,int n2) {
	  return n1/2;
  }
  
  void calculator(int n1,int n2) {   // 리턴 없는 일반 메쏘드
	  System.out.println(n1+"="+n2+"="+plus(n1,n2)) ;
	  System.out.println(n1+"-"+n2+"="+minus(n1,n2)) ;
	  System.out.println(n1+"*"+n2+"="+multiple(n1,n2)) ;
	  System.out.println(n1+"/"+n2+"="+divide(n1,n2)) ;
	  
  }
  // => 호출 가능 메쏘드 총 5개로 각각 호출 가능한 구조임.
  // 생성자 메쏘드는 여기 없음: 컴파일러가 알아서 넣어주기 때문에 생략되어 있다고 보기
  
  
  
  
}
