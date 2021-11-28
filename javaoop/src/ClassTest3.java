
public class ClassTest3 {
	public static void main(String[] args) {
  
		
		
		ClassTest2 ct=new ClassTest2();   // => ClassTest2() {} 이 실행됨.
		ct.sum();  //1-0까지의 합:0
		
		ClassTest2 ct2=new ClassTest2(100); // => ClassTest2(int num) {} 이 실행됨.
		 //num은 실행되는 동안에만 살아있기에 이걸 다른 변수로 받아줘야 함.
		ct2.sum();   //5050 ( 1-100까지의 합)
		
		ClassTest2 ct3=new ClassTest2(200, "홍길동");
		ct3.sum();
		
}
}