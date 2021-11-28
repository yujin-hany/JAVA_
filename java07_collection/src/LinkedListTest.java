
import java.util.LinkedList;
public class LinkedListTest {

	public LinkedListTest() {}
	
	public void start() {
		 LinkedList<String> ll= new LinkedList<String>();
		 
		 //��ü �߰�
		 ll.offer("�迬��");
		 ll.offer("�����");
		 
		 // ��ġ�� �ϱ�
		 ll.addFirst("������");
		 
		 
		 ll.addLast("�߽ż�");
		 System.out.println("size->"+ll.size());
		 
		 // ���� �տ� �ִ� ��ü ���
		 // ��ü�� get �ϸ� collection ���� �ش� ��ü ������
		 String txt=ll.pop();
		 System.out.println("txt pop->"+txt);
		 
		 
		 // 1���� �� �� ���
		 String txt2=ll.get(1);
		 System.out.println("txt pop->"+txt2);
		 // �̰� ��������. �ֳĸ� offer/pop �� �ƴ϶�
		 System.out.println("size->"+ll.size());
		 
		 
		
		 //��⿭ ������ �ϳ��� ���̰� ���־� �ϴϱ� 
		 //while������ pop ��� �ؼ� ��ü ������� ������ (isEmpty)
		 
		 // ��� ���� ������ �۾��ϰ� ��������� ������
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
























