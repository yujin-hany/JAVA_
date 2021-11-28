import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	
	// �Է� ���� ���� ����
	// �ߺ� ������ ����
	public HashSetTest() {}
	
	public void start() {
		// �̰͵� generic ����
		HashSet<String> hs=new HashSet <String>();
		HashSet<Integer> hs2=new HashSet <Integer>();  // int �� �ƴ϶� integer!!! Ŭ���� �̸��̶�,,
		
		
		// �迭 ����
		String name[]= {"�迬��","����ȯ","������","������","�����","����ȯ"};
		int[] num= {100,400,500,400,400,500};
		
		//���� �߰��ϱ�
		for (int i=0; i<name.length; i++ ) {
			hs.add(name[i]);
			hs2.add(num[i]); 
			// 
			
		}
		/////////////////////////////
		System.out.println("hs.size()->"+hs.size());
				
		System.out.println("hs2.size()->"+hs2.size());
		
		// hashset �� ��ü�� ������ ���ؼ��� Iterator ��ü�� ���ؾ� ��.
		
		Iterator<String> ii= hs.iterator();  // ���� generic���� string �־��־����.
		Iterator <Integer> iii=hs2.iterator();
		
		//while���� �̿��Ͽ� ���
		while(ii.hasNext()) {
			// ��ü�� ������ true, ������ false
			String data=ii.next();
			System.out.println(data);
			
			
		}
		while(iii.hasNext())  {
			// ��ü�� ������ true, ������ false
			Integer data=iii.next();
			System.out.println(data);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		HashSetTest ht= new HashSetTest();
		ht.start();
		
		
	}

}
