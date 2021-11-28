import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	
	String names[]= {"red","yello","green","black","white","pink","blue","purple","red","red"};
	int num[]= {25,68,59,45,63,65,32,8,62,97,54,98};
			
	
	public TreeSetTest() {
		
		
	}
	
	public void start() {
		// ���ʸ� �̿��ؼ� ��ü �����
		TreeSet<String> color=new TreeSet<String>();
		TreeSet<Integer> numet=new TreeSet<Integer>();
		
		for ( String c: names) {
			color.add(c); //���� ������ ����
			
			// numet�� color  ������ �޶� �̷��� ���� �ϴ� ��
		}for (Integer i: num) {
			numet.add(i);
		}
		
		
		
		// �ߺ� ������ ��� ����, �Է� ���� ���� ����, ��ü�� ���ĵ�.
		System.out.println("color.size()-?"+color.size());
		System.out.println("num.size()->"+numet.size());
		
		
		// ������ ������ ���� ��� : �⺻������ ��������
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
		
		/// ������ ������ ����
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









