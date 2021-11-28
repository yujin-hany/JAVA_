
public class AnonymousInner {

	
	public AnonymousInner() {}
	
	public void start() {
		//익명의 내부 클래스: 클래스명이 존재하지 않는 클래스
		
		
		// 원래 이렇게 해서 sam으로 sam  안의 기능을 사용함.
		Sample sam= new Sample(); // 객체 생성하는 것
		
		//!! 새로운 클래스니까 이렇게 해서 변수 안받고 함.!!
		new Sample() {
			//필요한 기능 추가 및 overriding 기술
			// sum() 은 sample에 있는데 이걸 overriding함.
			public void sum(){ 
				int i=0;
				for (int j=1; j<100; j+=2) {
					i+=j;
				}
				System.out.println("i="+i);
			}
			//샘플 클래스에 없는 메쏘드 만들기
			
			//sample()에 없는데 sample에 대입했지만 에러는 안남.
			 public void output() {
				 System.out.println("새로 추가된 메쏘드");
			 }
		
		}.output();   //.sum();
		sam.sum();
		//sam.output() ; // 여기에는 output이 없음. => 익명의 내부 클래스는 여기에서 한번만 실행하고
		// 다른 곳에서 쓸 일 없을 때 사용함.
	}
	public static void main(String[] args) {
		new AnonymousInner().start();
		
		
	}

}
