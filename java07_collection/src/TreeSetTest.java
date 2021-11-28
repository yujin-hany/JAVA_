import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
	String names[]= {"red","yello","green","black","white","pink","blue","purple","red","red"};
	int num[]= {25,68,59,45,63,65,32,8,62,97,54,98};
			
	
	public TreeSetTest() {
		
		
	}
	
	public void start() {
		// 제너릭 이용해서 객체 만들기
		TreeSet<String> color=new TreeSet<String>();
		TreeSet<Integer> numet=new TreeSet<Integer>();
		
		for ( String c: names) {
			color.add(c); //증복 데이터 있음
			
			// numet와 color  개수가 달라서 이렇게 따로 하는 것
		}for (Integer i: num) {
			numet.add(i);
		}
		
		
		
		// 중복 데이터 허용 안함, 입력 순서 유지 안함, 객체는 정렬됨.
		System.out.println("color.size()-?"+color.size());
		System.out.println("num.size()->"+numet.size());
		
		
		// 데이터 가지고 오는 방법 : 기본정렬은 오름차순
		Iterator<String> getStrData=color.iterator();
		while(getStrData.hasNext()) {
			System.out.print(getStrData.next()+"\t");
			
		}
		System.out.println();
		
		Iterator<Integer> getStrDat=numet.iterator();
		while(getStrDat.hasNext()) {
			System.out.print(getStrDat.next()+"\t");
			
		}
		System.out.println();
		
		/// 내림차 순으로 찍어보자
		Iterator<Integer> descNum=numet.descendingIterator();
		while(descNum.hasNext()) {
			System.out.print(descNum.next()+"\t");
			
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		TreeSetTest tt=new TreeSetTest();
		tt.start();
	}

}









