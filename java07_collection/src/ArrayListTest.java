import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	ArrayListTest() {}
	
	public void start() {
		Data d=new Data();
		List <MemberVO> lst =d.getMember(); // vo 4�� ��� ����Ʈ�� ���⵵ ���ʸ�
		
		// Ȯ��� for ������ access
		for (MemberVO  vo: lst) {
			System.out.println(vo.toString()); // vo �� ��ü�� ����� �ִµ� �츮�� toString ���������� �̿�
		}
		
		System.out.println(lst.size());

	}
	

	public static void main(String[] args) {
	
		ArrayListTest at=new ArrayListTest() ;
		at.start();
	}

}
