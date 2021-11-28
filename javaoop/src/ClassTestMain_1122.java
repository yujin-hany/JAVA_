
public class ClassTestMain_1122 {

	public static void main(String[] args) {
		
		//생성자 메소드의 종류만큼 객체를 타 클래스에서 생성가능함.
		//생성자 메소드는 객체 만들 때 한번 실행됨
		//객체 안만들면 실행 자체가 안됨
		//
		//객체 생성시 static이 생성자 메소드보다 더 빨리 나옴. => heap에 등록됨
		ListTest lt=new ListTest(100, "홍기동"); // => 따로 프린트 없어도 프린트 됨.
		System.out.println(lt); //=> 주소임.
		
		ListTest lte=new ListTest("홍기동",100);
		System.out.println(lte);
		
		//메소드 호출 : 객체.메소드명()
		lt.sum(); //이건 바로 값 나옴.
		 // 이거 하면 자동으로 total() 도 나옴
		// 위에서 프린트하라고했던 합 나옴=>그 다음에 total=>해당 값 나옴
		// 이건 변수로 안받아도 그냥 나옴.
		
		
		int result=lt.total(50); 
		
		// return 함. => result로 안받으면 안나옴!
		System.out.print(result);
		
		
		
		
		
	}

}
// num : call by value/ scan: call by reference
// 생성자 메소드는 