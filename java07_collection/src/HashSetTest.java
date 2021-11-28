import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	
	// 입력 순서 유지 안함
	// 중복 데이터 제거
	public HashSetTest() {}
	
	public void start() {
		// 이것도 generic 있음
		HashSet<String> hs=new HashSet <String>();
		HashSet<Integer> hs2=new HashSet <Integer>();  // int 가 아니라 integer!!! 클래스 이름이라,,
		
		
		// 배열 만듬
		String name[]= {"김연아","박태환","박지성","류현진","손흥민","박태환"};
		int[] num= {100,400,500,400,400,500};
		
		//값을 추가하기
		for (int i=0; i<name.length; i++ ) {
			hs.add(name[i]);
			hs2.add(num[i]); 
			// 
			
		}
		/////////////////////////////
		System.out.println("hs.size()->"+hs.size());
				
		System.out.println("hs2.size()->"+hs2.size());
		
		// hashset 의 객체를 얻어오기 위해서는 Iterator 객체를 구해야 함.
		
		Iterator<String> ii= hs.iterator();  // 여기 generic으로 string 넣어주어야함.
		Iterator <Integer> iii=hs2.iterator();
		
		//while문을 이용하여 출력
		while(ii.hasNext()) {
			// 객체가 있으면 true, 없으면 false
			String data=ii.next();
			System.out.println(data);
			
			
		}
		while(iii.hasNext())  {
			// 객체가 있으면 true, 없으면 false
			Integer data=iii.next();
			System.out.println(data);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		HashSetTest ht= new HashSetTest();
		ht.start();
		
		
	}

}
