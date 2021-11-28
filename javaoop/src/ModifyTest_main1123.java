
 import sawon.pub_1123;
public class ModifyTest_main1123 {

	// 생성자 메쏘드
	public ModifyTest_main1123 () {}
	public void start() {
		//default: 동일 패키지 내 클래스에서는 무조건 접근을 허용한다.
		ModifyTest_1123 mt=new ModifyTest_1123(); //객체 생성됨.
		
		
		// 접근 제한자가 default 임으로 사용 불가함.=> 사용 범위 제한
		pub_1123 lt=new pub_1123(); 
		// <= 이건 다른 defualt 패키지의 객체 생성 불가해서 에러임.
		// 아예 해당 생성자 메쏘드 찾을 수가 없음. (쓸수 있는 방법 그냥 없음)
		// class default 해서 안돼서 풀었는데도 안됨.=> 왜냐면 객체 생성 시에는 생성자 메쏘드로 default 라서
		// ==> 생성자 메쏘드에 public 붙여도 안됨.
		// => 어느 패키지에서 가져오는 건지 import 필요함. => 이거 까지 하면 이제 에러 안남.
		
		
		
		//객체 내의 변수 접근하기
		System.out.println("mt.num->"+mt.num);  //같은 패키지 내 default는 가능
		///System.out.println("lt.name->"+lt.name); //사용 불가능 since 전역변수의 접근 제한자가 default
		
		
		//메쏘드 호출
		mt.numPrint();  //호출 가능 
		lt.namePrint(); // not visible이라고 뜸. 
		// 이 메쏘드는 다른 패키지의 클래스라서 접근 불가임 : 메쏘드의 접근제한자가 default
		// => 사용하게 하려면 public 이라고 앞에 접근 제한자 써주어야 함.
		
		
		// private은 클래스 외부에서 객체를 통하여 접근하기 불가능
		//System.out.print("tel="+mt.tel); // 이건 private이라 불가능함.==캡슐화
		
		
		//System.out.println("addr"+lt.addr); // private에 패키지 다름.=> 접근 불가능
		
		
		//lt.addrOutput(); // 불가능함 since 이건 private이라 외부에서 접근 불가능함.
		
		
		//ModifyTest_1123 mt2=new ModifyTest_1123("010-4799-9356"); // 생성자 메쏘드를 사용하고 있는 클래스와
		//생성자 메쏘드가 있는 클래스으 클래스가 다름.=> private은 생성 불가능
		//=> 객체만드려면 앞에성 한 ModifyTest_1123() 으로 해야함.
		
		System.out.println(ModifyTest_1123.num);  //static을 붙여서 객체명이 아니라 그냥 클래스명으로
		ModifyTest_1123.numPrint();  //static은 new로 객체 안만들어도 쓸수 있게 해줌.
		
	}
	public static void main(String[] args) {
		new ModifyTest_main1123().start();

	}
	

	
	
	
	
	

}
