
public  class ModifyTest_1123 {  //default 가 됨.
	
	
	static int num=1234; //같은 패키지 내
	 private String tel="010-4799-9356"; // 여기 클래스에서만 사용 가능함.
	 
	 
	 // 생성자 메쏘드 만들기
	 ModifyTest_1123() {
		 System.out.println("ModifyTest_1123()");
		 
	 }
	private  ModifyTest_1123(String tel){
		 this.tel=tel;
		 
	 }
	 
	static  void numPrint() {
		 System.out.println("num = "+num);
		 
		 // num 자체는 그냥 default, 여기는 static이면 에러임.
		 // static 아니면 객체 안만들고는 못쓰기에 에러나는 것
		 // => 여기서 num 쓰려면 num 을 static으로 만들어야 함
		 
		 
		 // 너무 많이 static을 줄 시의 문제?
		 // 
	 }
	 

	
}
