
import java.util.LinkedList;
public class LinkedListTest {

	public LinkedListTest() {}
	
	public void start() {
		 LinkedList<String> ll= new LinkedList<String>();
		 
		 //객체 추가
		 ll.offer("김연아");
		 ll.offer("손흥민");
		 
		 // 새치기 하기
		 ll.addFirst("박지성");
		 
		 
		 ll.addLast("추신수");
		 System.out.println("size->"+ll.size());
		 
		 // 제일 앞에 있는 객체 얻기
		 // 객체를 get 하면 collection 에서 해당 객체 지워짐
		 String txt=ll.pop();
		 System.out.println("txt pop->"+txt);
		 
		 
		 // 1번쨰 꺼 얻어서 출력
		 String txt2=ll.get(1);
		 System.out.println("txt pop->"+txt2);
		 // 이건 안지워짐. 왜냐면 offer/pop 이 아니라서
		 System.out.println("size->"+ll.size());
		 
		 
		
		 //대기열 같은거 하나씩 줄이고 없애야 하니까 
		 //while문으로 pop 계속 해서 객체 비어있을 때까지 (isEmpty)
		 
		 // 비어 있지 않으면 작업하고 비어있으면 나가라
		 while (!ll.isEmpty() ) {
			System.out.println(ll.pop());
			 
		 }
		 System.out.println("size->"+ll.size());
		 
	}
	
	
	public static void main(String[] args) {
		LinkedListTest llt=new LinkedListTest();
		llt.start();
	}
}
























